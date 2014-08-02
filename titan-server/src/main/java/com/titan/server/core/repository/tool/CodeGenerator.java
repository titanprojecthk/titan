package com.titan.server.core.repository.tool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.commons.io.IOUtils;
import org.reflections.Reflections;


public class CodeGenerator {
	
	private static final String TARGET_PATH = "E:/git/repo/titan/titan-server/src/main/java/com/titan/server/core/repository";
	
	private static final String TEMPLATE_PATH = "E:/git/repo/titan/titan-server/src/main/java/com/titan/server/core/repository/tool/repository_template.txt";
	
	public static void main(String[] args) throws Exception {
		
		 Reflections reflections = new Reflections("com.titan.server.core.domain");

	     Set<Class<?>> entities = 
	               reflections.getTypesAnnotatedWith(Entity.class);
	     
	     String template = IOUtils.toString(new FileInputStream(TEMPLATE_PATH));
	     
	     for (Class<?> entity : entities) {
	    	 File repo = new File(TARGET_PATH, entity.getSimpleName() + "Repository.java");
	    	 if (!repo.exists()) {
	    		 String idType = "";
	    		 for (Field field : entity.getDeclaredFields()) {
	    			 if (field.isAnnotationPresent(Id.class)) {
	    				 idType = field.getType().getSimpleName();
	    			 }
	    		 }
	    		 
	    		 String repoSource = 
	    				 template
	    				 	.replace("${EntityName}", entity.getSimpleName())
	    				 	.replace("${EntityIdType}", idType);
	    		 

	    		 IOUtils.write(repoSource, new FileOutputStream(repo));
	    	 }
	     }
	}
}

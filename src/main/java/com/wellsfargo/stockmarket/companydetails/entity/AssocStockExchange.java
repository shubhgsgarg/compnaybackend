<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.3.3.RELEASE</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.wellsfargo.stockmarket</groupId>
	<artifactId>loginsignup</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>loginsignup</name>
	<description>Demo project for Spring Boot</description>

	<properties>
		<java.version>1.8</java.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

  		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
		</dependency>

<!-- 		<dependency>
		    <groupId>org.junit</groupId>
		    <artifactId>junit5-engine</artifactId>
		    <version>5.0.0-ALPHA</version>
		</dependency>
-->		
		<dependency>
		  <groupId>org.assertj</groupId>
		  <artifactId>assertj-core</artifactId>
		  <version>3.8.0</version>
		  <scope>compile</scope>
		</dependency>
		<dependency>
		  <groupId>org.mockito</groupId>
		  <artifactId>mockito-core</artifactId>
		  <version>2.11.0</version>
		  <scope>compile</scope>
		</dependency>
		<dependency>
		  <groupId>org.hamcrest</groupId>
		  <artifactId>hamcrest-core</artifactId>
		  <version>1.3</version>
		  <scope>compile</scope>
		</dependency>
		<dependency>
		  <groupId>org.hamcrest</groupId>
		  <artifactId>hamcrest-library</artifactId>
		  <version>1.3</version>
		  <scope>compile</scope>
		</dependency>
		<dependency>
		  <groupId>org.skyscreamer</groupId>
		  <artifactId>jsonassert</artifactId>
		  <version>1.5.0</version>
		  <scope>compile</scope>
		</dependency>
				
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
			<exclusions>
				<exclusion>
					<groupId>org.junit.vintage</groupId>
					<artifactId>junit-vintage-engine</artifactId>
				</exclusion>
			</exclusions>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>
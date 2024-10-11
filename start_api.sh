#!/usr/bin/env bash

./mvnw spring-boot:run -Dspring-boot.run.profiles=dev -Dspring-boot.run.jvmArguments="-Xmx256m -Xms128m" -Dspring-boot.run.arguments="'--DB_USER=postgres' '--DB_PASSWORD=postgres' '--DB_NAME=avengers'"

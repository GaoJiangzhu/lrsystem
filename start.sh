#!/bin/bash

rm target -rf
nohup mvn spring-boot:run -Drun.jvmArguments="-Xmx512m" -Drun.project=lrsystem >> logs/catalina.out  2>&1 &
 

 
 
 
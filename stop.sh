#!/bin/bash  

jps -lm |grep "spring-boot:run" |grep "lrsystem" | awk '{print $1}' |xargs kill -9
jps -lm |grep "LrsBackApplication" | awk '{print $1}' |xargs kill -9
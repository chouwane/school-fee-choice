#!/bin/bash

export JAVA_HOME=$HOME/jdk1.8.0_102
export MAIN_START_CLASS=org.springframework.boot.loader.JarLauncher
export MAIN_SERVER_OBJECT=pers.wh.school.fee.choice.SchoolFeeChoiceApplication
export MAIN_SERVRt_OPTS=
export HFP_SERVER_HOME=$HOME/school-fee-choice
export HFP_SERVER_CONFIG=$HFP_SERVER_HOME/config
export HFP_SERVER_LIB=$HFP_SERVER_HOME/lib
export HFP_SERVER_LOG=$HFP_SERVER_HOME/logs
export HFP_SERVER_PID=$HFP_SERVER_HOME/bin/$MAIN_SERVER_OBJECT.pid

CLASSPATH=.:$HFP_SERVER_CONFIG
cd $HFP_SERVER_LIB
for  lname in `ls -rt *.jar`
do
        CLASSPATH=$CLASSPATH:$HFP_SERVER_LIB"/"$lname
done
export CLASSPATH=$CLASSPATH


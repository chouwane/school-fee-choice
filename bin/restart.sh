#!/bin/bash

DEST_DIR=$HOME/school-fee-choice/bin

cd $DEST_DIR

. ./env.sh

cd $DEST_DIR

$HFP_SERVER_HOME/bin/shutdown.sh

sleep 5

$HFP_SERVER_HOME/bin/startup.sh

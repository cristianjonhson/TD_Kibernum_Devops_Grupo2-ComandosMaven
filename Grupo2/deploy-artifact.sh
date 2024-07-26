#!/bin/bash

# Variables
GROUP_ID="cl.TalentoDigitalKibernum"
ARTIFACT_ID="Grupo2"
VERSION="1.0.2"
PACKAGING="jar"
FILE_PATH="Grupo2/target/Grupo2-1.0-SNAPSHOT.jar"
REPOSITORY_ID="comandosmaven"
REPO_URL="http://localhost:8081/repository/comandosmaven/"

# Ejecutar comando Maven para desplegar el artefacto
mvn deploy:deploy-file \
    -DgroupId=${GROUP_ID} \
    -DartifactId=${ARTIFACT_ID} \
    -Dversion=${VERSION} \
    -Dpackaging=${PACKAGING} \
    -Dfile=${FILE_PATH} \
    -DgeneratePom=true \
    -DrepositoryId=${REPOSITORY_ID} \
    -Durl=${REPO_URL}

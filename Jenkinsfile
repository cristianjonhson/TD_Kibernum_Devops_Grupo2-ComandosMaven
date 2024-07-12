pipeline {
    agent any

    environment {
        MAVEN_HOME = tool 'Maven 3' // Define tu herramienta Maven configurada en Jenkins
        JAVA_HOME = tool 'JDK 1.8' // Define tu herramienta JDK configurada en Jenkins
        PATH = "${MAVEN_HOME}/bin:${JAVA_HOME}/bin:${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                // Clonar el repositorio
                git url: 'https://github.com/cristianjonhson/TD_Kibernum_Devops_Grupo2-ComandosMaven.git', branch: 'master'
            }
        }
        
        stage('Build') {
            steps {
                // Construir el proyecto con Maven
                sh 'mvn clean install'
            }
        }
        
        stage('Test') {
            steps {
                // Ejecutar pruebas con Maven
                sh 'mvn test'
            }
            post {
                always {
                    // Publicar resultados de pruebas
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

    post {
        always {
            // Limpieza de archivos temporales
            cleanWs()
        }
    }
}

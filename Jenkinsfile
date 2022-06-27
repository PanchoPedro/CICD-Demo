pipeline {
    agent any
    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MAVEN_HOME"
    }
    stages {
        stage('Unit tests') {
            steps {
              
		bat "mvn test"
            }
        }
        stage('Deploy') {
            steps {
                bat "mvn deploy"
            }
        }
    }
}
pipeline {
    agent any


    stages {
        stage('Unit tests') {
            steps {
              
		sh "mvn clean test"
            }
        }
        stage('Deploy') {
            steps {
                sh "mvn deploy"
            }
        }
    }
}
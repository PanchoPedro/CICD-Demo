pipeline {
    agent any


    stages {
        stage('Unit tests') {
            steps {
              
		sh "mvn test"
            }
        }
        stage('Deploy') {
            steps {
                sh "mvn deploy"
            }
        }
    }
}
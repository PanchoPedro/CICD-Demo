pipeline {
    agent any


    stages {
        stage('Unit tests') {
            steps {
              sh "mvn -version"
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
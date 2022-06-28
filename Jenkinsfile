pipeline {
    agent any


    stages {
        stage('Unit tests') {
            steps {
              
		sh "mvn -B -f clean test"
            }
        }
        stage('Deploy') {
            steps {
                sh "mvn deploy"
            }
        }
    }
}
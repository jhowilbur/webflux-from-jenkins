pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
               echo 'This is a minimal pipeline.'
            }
        }
        stage("build code"){
            steps{
              sh "apt install maven"
            }
        }
        stage("build code"){
            steps{
              sh "mvn clean install"
            }
        }
    }

}
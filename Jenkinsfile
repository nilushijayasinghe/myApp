pipeline {
    agent any

    stages{
        stage('Compile Stage'){

            steps {

                sh 'mvn clean compile'
             }
        }

            stage('Testing stage'){
                steps {
                     sh 'mvn test'
                    }
                }

            stage ('Deployment stage'){
                steps{
                    sh 'mvn deploy'
                    }
                }

            }

         }

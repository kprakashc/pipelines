pipeline {
    agent any 
    environment {
        siva = "Kalabhairav and time"
        name = "Narayana"
    }
    stages {
        stage ("First stage") {
            environment {
                ram = "Hanuman"
            }
            steps {
            echo " This Is Prakkaash World ${name}"
            echo "you are blessed by ${siva}"
            echo "Welcome ${ram}"
            }
        }
        stage ("Second stage"){
            steps {
            echo " This Is Prakkaash World ${name}"
            echo "you are blessed by ${siva}"
            echo "Welcome ${ram}"
            }
        }
        
    }
}
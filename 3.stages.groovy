pipeline {
    agent any
    stages {
        stage ('pk') {
            steps {
            echo "Prakkaash World"
            sh " hostname -i"
            
            }
        }
        stage ('groovy stage'){
            steps {
                script { 
                    def course = "k8s"
                    if (course == "k8s")
                    //println ("Thank you for enrolling")
                    println ("Thank you for enrolling to ${course}")
                    else 
                    println (" Do learn K8s")
                }
                
            }
        }
        
    }
}

//def course = "k8s"
//if (coursea == "k8s")
//println ("Thank you for enrolling")
//else (" Do learn K8s")
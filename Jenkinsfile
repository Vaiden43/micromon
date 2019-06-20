node {
  def app

  stage("Clone repository"){
    // clone the repository
    checkout scm

  }

  stage("permissions") {

dir("AdminServer"){
sh "./mvnw clean install"
}

    // change directory
    sh "cd AdminServer"
    // set maven wrapper permissions
    sh "cd AdminServer && chmod 711 ./mvnw"
  }

stage("Test"){
dir("AdminServer"){
sh "./mvnw clean install"
}
  // run tests
  sh "/.mvnw test"
}

stage("Build Project") {
  dir("AdminServer"){
sh "./mvnw clean install"
}
  //build the project
  sh "./mvnw clean install"
}

stage("Build Image") {
  dir("AdminServer"){
sh "./mvnw clean install"
}
  app = docker.build("vaiden/admin-server")
}

stage("Push Image"){
  dir("AdminServer"){
sh "./mvnw clean install"
}
  // push the image to the docker hub
  sh "echo TODO"
}

}

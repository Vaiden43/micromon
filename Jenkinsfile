node {
  def app

  stage("Clone repository"){
    // clone the repository
    checkout scm

  }

  stage("permissions") {
    // change directory
    sh "cd AdminServer"
    // set maven wrapper permissions
    sh "cd AdminServer && chmod 711 ./mvnw"
  }

stage("Test"){
  // run tests
  sh "/.mvnw test"
}

stage("Build Project") {
  //build the project
  sh "./mvnw clean install"
}

stage("Build Image") {
  app = docker.build("vaiden/admin-server")
}

stage("Push Image"){
  // push the image to the docker hub
  sh "echo TODO"
}

}

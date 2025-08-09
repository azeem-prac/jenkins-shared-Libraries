def call(String Projectname , String ImageTag , String DockerHubUser){
  echo "building the image"
  sh "docker build -t ${dockerHubUser}/${Projectname}:${ImageTag} . "
  echo "image build completed"
}

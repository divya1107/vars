def call()
{ 
 echo "hello world"
 println JOB_NAME
  wrap([$class: 'BuildUser']){
    println env.BUILD_NUMBER
    println env.BUILD_USER
}

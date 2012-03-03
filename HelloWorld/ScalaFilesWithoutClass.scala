val filesHere = (new java.io.File(".")).listFiles
val classFiles = (new java.io.File("./classes/")).listFiles

val classFileNames = for {
                       file <- classFiles 
                       if file.getName.endsWith(".class")
                     } yield file.getName

for (file <- filesHere if file.getName.endsWith(".scala") && (!classFileNames.contains(file.getName.dropRight(".scala".length) + ".class")))
  println(file)

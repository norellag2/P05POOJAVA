public class c01sintaxis {
    
        //los archivos .java deben tener al menos una clase
        // pero pueden tener más clases
        public static void main(String[] args) {
            class Mensaje {
                String textoIntro = "Nuevo Mensaje:";
                //los métodos en Java tienen una sintaxis 
                // tipo-retorno identificador (parámetros) {
                    //lógica del método
               // }
               String printMensaje(String textoIn) {
                   return (textoIntro + textoIn);
               }
            }

            Mensaje mensaje1 = new Mensaje();
            System.out.println(mensaje1.printMensaje ("Hola Mundo"));
        }
    
}

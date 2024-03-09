void main(){
  String original = "Olá, Target"; // Coloque aqui sua String para ser revertida
  print(reverterString(original));
}

String reverterString(String string){
  String? revertida;
  for(int i= string.length - 1; i >= 0; i--){
    revertida == null ? revertida = string : revertida += string[i]; 
  }
  return revertida ?? "Insira alguma String";
}
# Parcial 1

Servidor que responde a solicitudes para explorar clases del API de java dependiendo de la informacion que digite o requiera el usuario.

Los comandos que soporta el chat son los siguientes: (Segundo y tercero por implementar)
1. Class([class name]): Retorna una lista de campos declarados y métodos declarados
2. invoke([class name],[method name]): retorna el resultado de la invocación del método.  Ejemplo: unaryInvoke(java.lang.System, getenv).
3. unaryInvoke([class name],[method name],[paramtype],[param value]): retorna el resultado de la invocación del método. paramtype = int | double | String.


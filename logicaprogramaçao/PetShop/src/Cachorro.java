/ *
 * Para alterar este cabeçalho de licença, escolha Cabeçalhos de licença em Propriedades do projeto.
* Para alterar este arquivo de modelo, escolha Ferramentas | Modelos
 * e abra o modelo no editor.
 * /
pacote  petshop ;

/ **
 *
* @author SESI_SENAI
 * /
 classe  pública Cachorro  estende  Animal {
    focinheira booleana ;
    String estilo_rabo;
    castrado booleano ;

    public  boolean  isFocinheira () {
        voltar focinheira;
    }

    public  void  setFocinheira ( boolean  focinheira ) {
        isso . focinheira = focinheira;
    }

    public  String  getEstilo_rabo () {
        return estilo_rabo;
    }

    public  void  setEstilo_rabo ( String  estilo_rabo ) {
        isso . estilo_rabo = estilo_rabo;
    }

    public  boolean  isCastrado () {
        voltar castrado;
    }

    public  void  setCastrado ( boolean  castrado ) {
        isso . castrado = castrado;
    }

    public  int  getMatricula () {
        return matricula;
    }

    public  void  setMatricula ( int  matricula ) {
        isso . matrícula = matrícula;
    }

    public  String  getNome () {
        return nome;
    }

    public  void  setNome ( String  nome ) {
        isso . nome = nome;
    }

    public  String  getCor_pelagem () {
        return cor_pelagem;
    }

    public  void  setCor_pelagem ( String  cor_pelagem ) {
        isso . cor_pelagem = cor_pelagem;
    }

    public  String  getGenero () {
        return genero;
    }

    public  void  setGenero ( String  genero ) {
        isso . genero = genero;
    }

    public  int  getIdade () {
        voltar idade;
    }

    public  void  setIdade ( int  idade ) {
        isso . idade = idade;
    }

    public  float  getPeso () {
        retornar peso;
    }

    public  void  setPeso ( peso flutuante  ) {
        isso . peso = peso;
    }
    
    
    
}

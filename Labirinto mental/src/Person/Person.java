package Person;
public class Person {
    public String nome;
    public int sanidade;
    public Person(String nome, int sanidade){
        this.nome=nome;
        this.sanidade=sanidade;
    }
    public void Dsanidade(int sanidade, Person p) {
        p.sanidade-=sanidade;
    }

}
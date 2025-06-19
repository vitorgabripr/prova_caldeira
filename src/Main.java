import java.time.LocalDate;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //exercicio 1
        LocalDate base = LocalDate.of(2025, 6, 1); // 1º de junho de 2025
        int dias = 7;
        LocalDate novaData = base.plusDays(dias * 2 - 3);
        //dias (7) * 2 - 3 = 7 * 2 - 3 = 14 - 3 = 11
        System.out.println(novaData.getDayOfMonth());
        //novaData = base.plusDays(11) == 1º de junho + 11 dias = 12 de junho de 2025
        //resposta: 12
        //exercicio2
        int nota = 7;
        int peso = 2;
        double media = (nota * peso + 6 * 3) / 5;
        if (media >= 7.0) {
            //nota+peso = 14
            // 14 + 18 = 32
            //  32 / 5 = 6.4
            System.out.println("Aprovado");
        } else {
            System.out.println("Revisar conteúdo");
        }
        //reprovado: 6.4 a nota

        //exercicio 3:
        //  public class Item {
        //     String nome;
        //     int quantidade;

        //     public Item(String nome) {
        //         this.nome = nome;
        //         this.quantidade = 1;
        //    }

        //   public Item(String nome, int quantidade) {
        //       this.nome = nome;
        //       this.quantidade = quantidade;
        //  }

        // public static void main(String[] args) {
        //     Item x = new Item("Caderno");          // usa o construtor que define quantidade = 1
        //      Item y = new Item("Caneta", 3);        // usa o construtor com quantidade = 3
        //      System.out.println(x.quantidade + y.quantidade);

        // RESPOSTA: x (1) + y(3) = 4

        //exercicio 4:
        int prioridade = 4;
        int urgencia = 8;

        if (prioridade > 3 && urgencia > 7) {
            System.out.println("Tarefa crítica");
        } else if (prioridade > 3 || urgencia > 7) {
            System.out.println("Tarefa importante");
        } else {
            System.out.println("Tarefa comum");
        }
        //prioridade 4 é maior q 3 ent é TRUE
        //urgencia é maior q 7 ent é TRUE
        //resposta: entao é tarefa critica

        //exercicio 5:
        int notificacoes = 0;

        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {      // se i for par
                notificacoes += 2;  // adiciona 2
            } else {               // Se i for impar
                notificacoes++;     // adiciona 1
            }
        }

        System.out.println(notificacoes);
        //i = 1 (impar): notificacoes = 0+1=1
        //
        //i = 2 (par): notificacoes = 1+2=3

        //i = 3 (impar): notificacoes = 3+1=4

        //i = 4 (par): notificacoes = 4+2=6

        //i = 5 (impar): notificacoes = 6+1=7
        //resposta: 7

        //PROXIMO EXERCICIO
        ArrayList<String> horarios = new ArrayList<>();
        horarios.add("08:00");   // indice 0
        horarios.add("10:00");   // indice 1
        horarios.add("12:00");   // indice 2
        horarios.remove(1);      // remove "10:00", o indice 1 agora é "12:00"
        horarios.add("14:00");   // adicionado no final, indice 2

        //08:00

        //08:00, 10:00

        //08:00, 10:00, 12:00

        //Remove 10:00== [08:00, 12:00]

        //Adiciona 4:00 == [08:00, 12:00, 14:00]

        System.out.println(horarios.get(1));
        //resposta: 12:00

        //PROXIMO EXERCICIO:
        class Livro {
            String titulo;
            boolean emprestado;

            public void emprestar() {
                emprestado = true;
            }

            public String status() {
                if (emprestado) {
                    return "Indisponível";
                }
                return "Disponível";
            }
            // Livro l = new Livro();  // emprestado = false por padrão
            // l.titulo = "Java para Iniciantes";
            //  System.out.println(l.status());  // imprime se ta disponivel
            //   l.emprestar();                   // muda emprestado pra true
            //  System.out.println(l.status());  // imprime indisponivel
            //resposta: Disponivel e indisponivel


            //´PROXIMO EXERCICIO:
            public class Usuario {
                String nome;
                int idade;

                public Usuario(String n, int i) {
                    nome = n;
                    idade = i;
                    //Usuario u = new Usuario("João", 25)usa new e passa os dois argumentos exigidos


                }
            }
            // proxima atividade
            //resposta: git reset --soft HEAD1 pq desfaz o commit e mantem tudo em staging

            //proxima atividade:
            //resposta: git checkout Calculadora.java  porque descarta as alteracoes locais no arquivo especificado
            // e restaura pra versão do ultimo commit

            //proxima atividade:

            //LocalDate hoje = LocalDate.of(2025, 6, 9);
            //LocalDate prazo = hoje.plusDays(10);   adiciona mais 10 dias (9+10)
            //System.out.println(prazo);


            //proxima atividade:
            //LocalDate data = LocalDate.of(2025, 6, 10); // data inicial: 10 de junho de 2025
            //int diasUteis = 0; // contador de dias uteis

            //while (diasUteis < 7) {
            //data = data.plusDays(1);

            //boolean fimDeSemana = data.getDayOfWeek() == DayOfWeek.SATURDAY || data.getDayOfWeek() == DayOfWeek.SUNDAY;

            // boolean feriado = data.equals(LocalDate.of(2025, 6, 15));

            //if (!fimDeSemana && !feriado) {
            // diasUteis++;

            //System.out.println(data);

            //no final da 9 iteracao, atinge o 7. o loop acaba e a
            // ultima data que foi atribuida a data é 2025-06-19.
        }

        //PROXIMO

        //LocalTime envio = LocalTime.of(23, 0);
        //LocalTime limite = LocalTime.of(22, 59);

        //if (!envio.isBefore(limite)) {
            //System.out.println("Entrega fora do horário.");
        //} else {
            //System.out.println("Tarefa enviada com sucesso.");

        //resposta: entrega fora do horario
        //}



        //PROXIMO

        /*public static void main(String[] args) {
            List<Tarefa> tarefas = new ArrayList<>();
            tarefas.add(new Tarefa("Estudar"));
            tarefas.add(new Tarefa("Almoçar"));
            tarefas.add(new Tarefa("Dormir"));

            Collections.sort(tarefas); //aqui acontece a ordenacao alfabetica
            System.out.println(tarefas);
            //resposta: Almoçar, Dormir, Estudar porque é em ordem alfabetica
        }*/


        //proximo:

        ArrayList<String> tarefas = new ArrayList<>();
        tarefas.add("Estudar Java");
        tarefas.add("Fazer exercícios");
        tarefas.add("Revisar código");

        for (String tarefa : tarefas) { // pra cada tarefa na lista
            if (tarefa.contains("Java")) { // se a tafera nao tiver "Java
                System.out.println("Tarefa de programação: " + tarefa); //imprime a mensagem
            }
        }
        //resposta: apenas estudar java
    }

}

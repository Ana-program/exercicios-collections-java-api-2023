package list;

public class Main {

    public static void main(String[] args) {
        
        ListaTarefa listaTarefa = new ListaTarefa();

        //System.out.println("O número total de elementos na lista é:" + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");

        System.out.println("O número total de elementos na lista é:" + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removeTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é:" + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricaoTarefas();

    }
    
}

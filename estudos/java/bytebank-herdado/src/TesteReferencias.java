
public class TesteReferencias {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setSalario(5000.0);
//		String nome = g1.getNome();
		
//		Funcionario f = new Funcionario();
//		f.setNome("Angelo");
//		f.setSalario(2000.0);
		
		EditorVideo ev = new EditorVideo ();
		ev.setNome("Lester");
		ev.setSalario(2500.0);
		
		Designer d = new Designer ();
		d.setNome("Thomas");
		d.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao ();
		controle.registra(g1);
//		controle.registra(f);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		
	}
}

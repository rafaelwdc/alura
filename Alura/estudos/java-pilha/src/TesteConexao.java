
public class TesteConexao implements AutoCloseable {

	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deus erro na conexão");
		}
		
		
		
		
		
		
		//--------------------------------------//
		
		
//		Conexao con = null;
//		
//		try {
//			
//			con = new Conexao();
//			con.leDados();
//			
//		} catch (IllegalStateException ex) {
//			
//			System.out.println("Deu erro na conexão");
//			
//		} finally {
//			if (con != null) {
//				con.fecha();
//			}
//			
//		}
//		
//		
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}


}

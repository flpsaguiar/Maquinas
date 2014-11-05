package Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by felipeweb on 30/10/14.
 */
public class Client {
	private String resposta;
	private String pedido;
	private static final String SERVER = "10.103.1.112";
	private static final int PORT = 1234;

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}


	public void abreConn() throws IOException, UnknownHostException {
		//estabelecimento de conexao com o servidor
		Socket client = new Socket(SERVER, PORT);

		//estabelecimento de canal para receber dados
		DataInputStream in = new DataInputStream(client.getInputStream());

		//estabelecimento de canal para envio de dados
		DataOutputStream out = new DataOutputStream(client.getOutputStream());

		out.writeUTF(this.pedido);

		this.resposta = in.readUTF();
		System.out.println(resposta);

		in.close();
		out.close();
		client.close();
	}
}

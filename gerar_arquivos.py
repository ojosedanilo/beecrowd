inicio = 1039
fim = 1052
extensao = "java"
caminho = "java"


def gerar_conteudo(numero_questao: str) -> str:
    return (
        """import java.util.Scanner;

public class BEE"""
        + numero_questao
        + """ {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        teclado.close();
    }
}
"""
    )


def gerar_arquivos(inicio, fim, extensao, caminho="./"):
    for i in range(inicio, fim + 1):
        with open(f"{caminho}/BEE{i}.{extensao}", "a+") as f:
            if f.read().strip() == "":
                f.write(gerar_conteudo(str(i)))
                f.buffer.flush()
                f.close()


gerar_arquivos(inicio, fim, extensao, caminho)

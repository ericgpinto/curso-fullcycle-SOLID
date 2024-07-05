package lsp.problem;

public class ModernTimes extends Movie{
    //ModernTime é um filme sem som. Logo, estamos violando o principio do LSP, pois o comportamento desta classe
    // muda quando os métodos são substituídos

    // ModernTimes não pode estender de Movie, pois, apesar de ser considerado um filme, não possui o mesmo comportamento.

    @Override
    public void increaseVolume() {
        //erro
    }


    
}

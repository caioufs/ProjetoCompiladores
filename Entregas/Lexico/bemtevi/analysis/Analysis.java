/* This file was generated by SableCC (http://www.sablecc.org/). */

package bemtevi.analysis;

import bemtevi.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseTMolde(TMolde node);
    void caseTSe(TSe node);
    void caseTSenao(TSenao node);
    void caseTPassa(TPassa node);
    void caseTPor(TPor node);
    void caseTContem(TContem node);
    void caseTFim(TFim node);
    void caseTConstante(TConstante node);
    void caseTFuncao(TFuncao node);
    void caseTObjeto(TObjeto node);
    void caseTString(TString node);
    void caseTBool(TBool node);
    void caseTNumero(TNumero node);
    void caseTTexto(TTexto node);
    void caseTVerdade(TVerdade node);
    void caseTFalso(TFalso node);
    void caseTNumeros(TNumeros node);
    void caseTSoma(TSoma node);
    void caseTMenos(TMenos node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTMenor(TMenor node);
    void caseTMenorIgual(TMenorIgual node);
    void caseTComparacao(TComparacao node);
    void caseTNegacao(TNegacao node);
    void caseTDoisMaior(TDoisMaior node);
    void caseTAbreBloco(TAbreBloco node);
    void caseTFechaBloco(TFechaBloco node);
    void caseTParEsq(TParEsq node);
    void caseTParDir(TParDir node);
    void caseTDoisPontos(TDoisPontos node);
    void caseTVirgula(TVirgula node);
    void caseTPontoVirgula(TPontoVirgula node);
    void caseTPonto(TPonto node);
    void caseTPipe(TPipe node);
    void caseTIdMolde(TIdMolde node);
    void caseTId(TId node);
    void caseTVazio(TVazio node);
    void caseTComentarioLinha(TComentarioLinha node);
    void caseTComentarioBloco(TComentarioBloco node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}

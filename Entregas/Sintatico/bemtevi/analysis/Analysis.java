/* This file was generated by SableCC (http://www.sablecc.org/). */

package bemtevi.analysis;

import bemtevi.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAProgramaPrograma(AProgramaPrograma node);
    void caseAFamiliaOpcionalFamiliaOpcional(AFamiliaOpcionalFamiliaOpcional node);
    void caseAFamiliaFamilia(AFamiliaFamilia node);
    void caseARelacaoRelacao(ARelacaoRelacao node);
    void caseADefMoldeDefMolde(ADefMoldeDefMolde node);
    void caseADecConsAttrAux(ADecConsAttrAux node);
    void caseADecObjAttrAux(ADecObjAttrAux node);
    void caseAAtributosAtributos(AAtributosAtributos node);
    void caseAMetodosMetodos(AMetodosMetodos node);
    void caseADecConsDecCons(ADecConsDecCons node);
    void caseADecConstInitDecCons(ADecConstInitDecCons node);
    void caseADecObjDecObj(ADecObjDecObj node);
    void caseABoolTipoPrimitivo(ABoolTipoPrimitivo node);
    void caseANumeroTipoPrimitivo(ANumeroTipoPrimitivo node);
    void caseATextoTipoPrimitivo(ATextoTipoPrimitivo node);
    void caseATipoMoldeTipoMolde(ATipoMoldeTipoMolde node);
    void caseATipoMoldeTipo(ATipoMoldeTipo node);
    void caseATipoPrimitivoTipo(ATipoPrimitivoTipo node);
    void caseADecFuncaoDecFuncao(ADecFuncaoDecFuncao node);
    void caseADecFuncaoSemBlocoDecFuncao(ADecFuncaoSemBlocoDecFuncao node);
    void caseAMaisParametroMaisParametro(AMaisParametroMaisParametro node);
    void caseAParametrosParametros(AParametrosParametros node);
    void caseAParametroParametro(AParametroParametro node);
    void caseAAssinaturaParametro(AAssinaturaParametro node);
    void caseAAssinaturaAssinatura(AAssinaturaAssinatura node);
    void caseAMaisParametrosAssinaturaMaisParametrosAssinatura(AMaisParametrosAssinaturaMaisParametrosAssinatura node);
    void caseAParametrosAssinaturaParametrosAssinatura(AParametrosAssinaturaParametrosAssinatura node);
    void caseATipoParametroAssinatura(ATipoParametroAssinatura node);
    void caseAAssinaturaParametroAssinatura(AAssinaturaParametroAssinatura node);
    void caseADecConsConteudoBloco(ADecConsConteudoBloco node);
    void caseADecObjConteudoBloco(ADecObjConteudoBloco node);
    void caseADefinicaoConteudoBloco(ADefinicaoConteudoBloco node);
    void caseABlocoBloco(ABlocoBloco node);
    void caseADefinicaoDefinicao(ADefinicaoDefinicao node);
    void caseAMaisIdMaisId(AMaisIdMaisId node);
    void caseAAtributoAtributo(AAtributoAtributo node);
    void caseASeSenaoSeSenao(ASeSenaoSeSenao node);
    void caseATermoExp(ATermoExp node);
    void caseASomaExp(ASomaExp node);
    void caseAMenosExp(AMenosExp node);
    void caseAMenorExp(AMenorExp node);
    void caseAIgualExp(AIgualExp node);
    void caseAMenorIgualExp(AMenorIgualExp node);
    void caseANegacaoExp(ANegacaoExp node);
    void caseANegativoExp(ANegativoExp node);
    void caseAEExp(AEExp node);
    void caseAOuExp(AOuExp node);
    void caseABlocoExp(ABlocoExp node);
    void caseAVerdadeExpBool(AVerdadeExpBool node);
    void caseAFalsoExpBool(AFalsoExpBool node);
    void caseAFatorTermo(AFatorTermo node);
    void caseAMultTermo(AMultTermo node);
    void caseADivTermo(ADivTermo node);
    void caseAModTermo(AModTermo node);
    void caseANumerosFator(ANumerosFator node);
    void caseAStringFator(AStringFator node);
    void caseABoolFator(ABoolFator node);
    void caseAParentesesFator(AParentesesFator node);
    void caseAInstanciaFator(AInstanciaFator node);
    void caseAChamadaFator(AChamadaFator node);
    void caseAIdFator(AIdFator node);
    void caseAAtributoFator(AAtributoFator node);
    void caseAInstanciaInstancia(AInstanciaInstancia node);
    void caseAMaisInicializacaoObjetoMaisInicializacaoObjeto(AMaisInicializacaoObjetoMaisInicializacaoObjeto node);
    void caseAListaInicializacaoListaInicializacao(AListaInicializacaoListaInicializacao node);
    void caseAInicializacaoObjetoInicializacaoObjeto(AInicializacaoObjetoInicializacaoObjeto node);
    void caseAChamadaChamada(AChamadaChamada node);
    void caseAMaisExpMaisExp(AMaisExpMaisExp node);
    void caseAListaExpListaExp(AListaExpListaExp node);

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
    void caseTIgual(TIgual node);
    void caseTMenor(TMenor node);
    void caseTMenorIgual(TMenorIgual node);
    void caseTComparacao(TComparacao node);
    void caseTNegacao(TNegacao node);
    void caseTDoisMaior(TDoisMaior node);
    void caseTE(TE node);
    void caseTOu(TOu node);
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

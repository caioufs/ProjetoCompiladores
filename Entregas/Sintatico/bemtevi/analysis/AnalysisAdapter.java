/* This file was generated by SableCC (http://www.sablecc.org/). */

package bemtevi.analysis;

import java.util.*;
import bemtevi.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProgramaPrograma(AProgramaPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFamiliaOpcionalFamiliaOpcional(AFamiliaOpcionalFamiliaOpcional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFamiliaFamilia(AFamiliaFamilia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARelacaoRelacao(ARelacaoRelacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADefMoldeDefMolde(ADefMoldeDefMolde node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecConsAttrAux(ADecConsAttrAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecObjAttrAux(ADecObjAttrAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtributosAtributos(AAtributosAtributos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMetodosMetodos(AMetodosMetodos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecConsDecCons(ADecConsDecCons node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecConstInitDecCons(ADecConstInitDecCons node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecObjDecObj(ADecObjDecObj node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABoolTipoPrimitivo(ABoolTipoPrimitivo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroTipoPrimitivo(ANumeroTipoPrimitivo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATextoTipoPrimitivo(ATextoTipoPrimitivo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoMoldeTipoMolde(ATipoMoldeTipoMolde node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoMoldeTipo(ATipoMoldeTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoPrimitivoTipo(ATipoPrimitivoTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecFuncaoDecFuncao(ADecFuncaoDecFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecFuncaoSemBlocoDecFuncao(ADecFuncaoSemBlocoDecFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaisParametroMaisParametro(AMaisParametroMaisParametro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametrosParametros(AParametrosParametros node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametroParametro(AParametroParametro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssinaturaParametro(AAssinaturaParametro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssinaturaAssinatura(AAssinaturaAssinatura node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaisParametrosAssinaturaMaisParametrosAssinatura(AMaisParametrosAssinaturaMaisParametrosAssinatura node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametrosAssinaturaParametrosAssinatura(AParametrosAssinaturaParametrosAssinatura node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoParametroAssinatura(ATipoParametroAssinatura node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssinaturaParametroAssinatura(AAssinaturaParametroAssinatura node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecConsConteudoBloco(ADecConsConteudoBloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecObjConteudoBloco(ADecObjConteudoBloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADefinicaoConteudoBloco(ADefinicaoConteudoBloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocoBloco(ABlocoBloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADefinicaoDefinicao(ADefinicaoDefinicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaisIdMaisId(AMaisIdMaisId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtributoAtributo(AAtributoAtributo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeSenaoSeSenao(ASeSenaoSeSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermoExp(ATermoExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASomaExp(ASomaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosExp(AMenosExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorExp(AMenorExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualExp(AIgualExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorIgualExp(AMenorIgualExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANegacaoExp(ANegacaoExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANegativoExp(ANegativoExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEExp(AEExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOuExp(AOuExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocoExp(ABlocoExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVerdadeExpBool(AVerdadeExpBool node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFalsoExpBool(AFalsoExpBool node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFatorTermo(AFatorTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultTermo(AMultTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivTermo(ADivTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAModTermo(AModTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumerosFator(ANumerosFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringFator(AStringFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABoolFator(ABoolFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParentesesFator(AParentesesFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInstanciaFator(AInstanciaFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaFator(AChamadaFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdFator(AIdFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtributoFator(AAtributoFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInstanciaInstancia(AInstanciaInstancia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaisInicializacaoObjetoMaisInicializacaoObjeto(AMaisInicializacaoObjetoMaisInicializacaoObjeto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaInicializacaoListaInicializacao(AListaInicializacaoListaInicializacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInicializacaoObjetoInicializacaoObjeto(AInicializacaoObjetoInicializacaoObjeto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaChamada(AChamadaChamada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaisExpMaisExp(AMaisExpMaisExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaExpListaExp(AListaExpListaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMolde(TMolde node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPassa(TPassa node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPor(TPor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTContem(TContem node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFim(TFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConstante(TConstante node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFuncao(TFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTObjeto(TObjeto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBool(TBool node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumero(TNumero node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTexto(TTexto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVerdade(TVerdade node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFalso(TFalso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumeros(TNumeros node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSoma(TSoma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenos(TMenos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenor(TMenor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorIgual(TMenorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComparacao(TComparacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNegacao(TNegacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoisMaior(TDoisMaior node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreBloco(TAbreBloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaBloco(TFechaBloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTParEsq(TParEsq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTParDir(TParDir node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoisPontos(TDoisPontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontoVirgula(TPontoVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPonto(TPonto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPipe(TPipe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdMolde(TIdMolde node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVazio(TVazio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioLinha(TComentarioLinha node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioBloco(TComentarioBloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
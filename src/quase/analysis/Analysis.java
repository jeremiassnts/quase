/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.analysis;

import quase.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAPrograma(APrograma node);
    void caseAFamiliaFamilia(AFamiliaFamilia node);
    void caseAVazioFamilia(AVazioFamilia node);
    void caseAFamiliaAux(AFamiliaAux node);
    void caseARelacao(ARelacao node);
    void caseADefClasse(ADefClasse node);
    void caseAAtributos(AAtributos node);
    void caseADecObjDecAux(ADecObjDecAux node);
    void caseADecVarDecAux(ADecVarDecAux node);
    void caseADecConsDecAux(ADecConsDecAux node);
    void caseAMetodos(AMetodos node);
    void caseADecProcedimentoMetodosAux(ADecProcedimentoMetodosAux node);
    void caseADecFuncaoMetodosAux(ADecFuncaoMetodosAux node);
    void caseADecObj(ADecObj node);
    void caseADecVar(ADecVar node);
    void caseAVirgIdAux(AVirgIdAux node);
    void caseADecCons(ADecCons node);
    void caseAVirgInicializacaoAux(AVirgInicializacaoAux node);
    void caseAInicializacao(AInicializacao node);
    void caseATipoClasseTipo(ATipoClasseTipo node);
    void caseATipoPrimitivoTipo(ATipoPrimitivoTipo node);
    void caseAIntTipoPrimitivo(AIntTipoPrimitivo node);
    void caseABoolTipoPrimitivo(ABoolTipoPrimitivo node);
    void caseARealTipoPrimitivo(ARealTipoPrimitivo node);
    void caseATipoClasse(ATipoClasse node);
    void caseADecProcedimento(ADecProcedimento node);
    void caseADecFuncao(ADecFuncao node);
    void caseAVazioParametros(AVazioParametros node);
    void caseAParametrosParametros(AParametrosParametros node);
    void caseAVirgParametroAux(AVirgParametroAux node);
    void caseAParametro(AParametro node);
    void caseAIfOnlyComando(AIfOnlyComando node);
    void caseAIfElseComando(AIfElseComando node);
    void caseAWhileComando(AWhileComando node);
    void caseAAtrComando(AAtrComando node);
    void caseAChamadaComando(AChamadaComando node);
    void caseABlocoComando(ABlocoComando node);
    void caseAIdPontoAux(AIdPontoAux node);
    void caseABloco(ABloco node);
    void caseARealExp(ARealExp node);
    void caseAIntExp(AIntExp node);
    void caseATrueExp(ATrueExp node);
    void caseAFalseExp(AFalseExp node);
    void caseAIdExp(AIdExp node);
    void caseAChamadaExp(AChamadaExp node);
    void caseAAtributoExp(AAtributoExp node);
    void caseAParExp(AParExp node);
    void caseASubtPartExp(ASubtPartExp node);
    void caseAIfExp(AIfExp node);
    void caseAAdcExp(AAdcExp node);
    void caseASubtExp(ASubtExp node);
    void caseAMultExp(AMultExp node);
    void caseADivExp(ADivExp node);
    void caseAModExp(AModExp node);
    void caseAIgualExp(AIgualExp node);
    void caseAMenorExp(AMenorExp node);
    void caseANaoExp(ANaoExp node);
    void caseAAndExp(AAndExp node);
    void caseAOrExp(AOrExp node);
    void caseABlocoExpExp(ABlocoExpExp node);
    void caseABlocoExp(ABlocoExp node);
    void caseAChamada(AChamada node);
    void caseAVazioListaExp(AVazioListaExp node);
    void caseAListaExpListaExp(AListaExpListaExp node);
    void caseAVirgExpAux(AVirgExpAux node);

    void caseTEComercial(TEComercial node);
    void caseTPontoVirg(TPontoVirg node);
    void caseTClasse(TClasse node);
    void caseTFilhaClasse(TFilhaClasse node);
    void caseTComeca(TComeca node);
    void caseTTermina(TTermina node);
    void caseTObj(TObj node);
    void caseTVirg(TVirg node);
    void caseTVar(TVar node);
    void caseTCons(TCons node);
    void caseTAtr(TAtr node);
    void caseTIntTipo(TIntTipo node);
    void caseTBoolTipo(TBoolTipo node);
    void caseTRealTipo(TRealTipo node);
    void caseTDetProcInicial(TDetProcInicial node);
    void caseTProc(TProc node);
    void caseTParEsq(TParEsq node);
    void caseTParDir(TParDir node);
    void caseTFunc(TFunc node);
    void caseTSe(TSe node);
    void caseTSenao(TSenao node);
    void caseTEnquanto(TEnquanto node);
    void caseTIgualSimples(TIgualSimples node);
    void caseTPonto(TPonto node);
    void caseTBoolVerdadeiro(TBoolVerdadeiro node);
    void caseTBoolFalso(TBoolFalso node);
    void caseTSubt(TSubt node);
    void caseTEntao(TEntao node);
    void caseTAdc(TAdc node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTIgualComp(TIgualComp node);
    void caseTMenor(TMenor node);
    void caseTNao(TNao node);
    void caseTELogico(TELogico node);
    void caseTOuLogico(TOuLogico node);
    void caseTComentario(TComentario node);
    void caseTId(TId node);
    void caseTCid(TCid node);
    void caseTVazio(TVazio node);
    void caseTNumInteiro(TNumInteiro node);
    void caseTNumReal(TNumReal node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}

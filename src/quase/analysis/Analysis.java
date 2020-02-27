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
    void caseAProgramaPrograma(AProgramaPrograma node);
    void caseAFamiliaFamilia(AFamiliaFamilia node);
    void caseAVazioFamilia(AVazioFamilia node);
    void caseARelacaoRelacao(ARelacaoRelacao node);
    void caseADefClasseDefClasse(ADefClasseDefClasse node);
    void caseAAtributosAtributos(AAtributosAtributos node);
    void caseAMetodosMetodos(AMetodosMetodos node);
    void caseADecObjDecObj(ADecObjDecObj node);
    void caseADecVarDecVar(ADecVarDecVar node);
    void caseADecConsDecCons(ADecConsDecCons node);
    void caseAInicializacaoInicializacao(AInicializacaoInicializacao node);
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
    void caseAParametro(AParametro node);
    void caseAIfOnlyComando(AIfOnlyComando node);
    void caseAComando1Comando(AComando1Comando node);
    void caseAIfElseComando1(AIfElseComando1 node);
    void caseAComando2Comando1(AComando2Comando1 node);
    void caseAWhileComando2(AWhileComando2 node);
    void caseAComando3Comando2(AComando3Comando2 node);
    void caseAAtrComando3(AAtrComando3 node);
    void caseAChamadaComando3(AChamadaComando3 node);
    void caseABlocoComando3(ABlocoComando3 node);
    void caseABloco(ABloco node);
    void caseAIfExp(AIfExp node);
    void caseAExp1Exp(AExp1Exp node);
    void caseASubtExp1(ASubtExp1 node);
    void caseAAdcExp1(AAdcExp1 node);
    void caseASubtPartExp1(ASubtPartExp1 node);
    void caseAExp1Exp1(AExp1Exp1 node);
    void caseAMultExp2(AMultExp2 node);
    void caseADivExp2(ADivExp2 node);
    void caseAModExp2(AModExp2 node);
    void caseAExp3Exp2(AExp3Exp2 node);
    void caseAIgualExp3(AIgualExp3 node);
    void caseAMenorExp3(AMenorExp3 node);
    void caseAExp4Exp3(AExp4Exp3 node);
    void caseAAndExp4(AAndExp4 node);
    void caseAOrExp4(AOrExp4 node);
    void caseAExp5Exp4(AExp5Exp4 node);
    void caseANaoExp5(ANaoExp5 node);
    void caseAExp6Exp5(AExp6Exp5 node);
    void caseARealExp6(ARealExp6 node);
    void caseAIntExp6(AIntExp6 node);
    void caseATrueExp6(ATrueExp6 node);
    void caseAFalseExp6(AFalseExp6 node);
    void caseAParExp6(AParExp6 node);
    void caseAAtributoExp6(AAtributoExp6 node);
    void caseAChamadaExp6(AChamadaExp6 node);
    void caseABlocoExpExp6(ABlocoExpExp6 node);
    void caseABlocoExpBlocoExp(ABlocoExpBlocoExp node);
    void caseAChamadaChamada(AChamadaChamada node);
    void caseAIdAtributo(AIdAtributo node);
    void caseAVazioListaExp(AVazioListaExp node);
    void caseAListaExpListaExp(AListaExpListaExp node);
    void caseAIdPontoIdPontoAux(AIdPontoIdPontoAux node);
    void caseAVirgExpVirgExpAux(AVirgExpVirgExpAux node);
    void caseAVirgInicializacaoVirgInicializacaoAux(AVirgInicializacaoVirgInicializacaoAux node);
    void caseAVirgIdVirgIdAux(AVirgIdVirgIdAux node);
    void caseADecObjDecAux(ADecObjDecAux node);
    void caseADecVarDecAux(ADecVarDecAux node);
    void caseADecConsDecAux(ADecConsDecAux node);
    void caseAVirgParametroAux(AVirgParametroAux node);
    void caseADecProcedimentoMetodosAux(ADecProcedimentoMetodosAux node);
    void caseADecFuncaoMetodosAux(ADecFuncaoMetodosAux node);
    void caseAEComercialRelacaoFamiliaAux(AEComercialRelacaoFamiliaAux node);

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

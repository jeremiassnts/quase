/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.analysis;

import java.util.*;
import quase.node.*;

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
    public void caseAFamiliaFamilia(AFamiliaFamilia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVazioFamilia(AVazioFamilia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARelacaoRelacao(ARelacaoRelacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADefClasseDefClasse(ADefClasseDefClasse node)
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
    public void caseADecObjDecObj(ADecObjDecObj node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecVarDecVar(ADecVarDecVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecConsDecCons(ADecConsDecCons node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInicializacaoInicializacao(AInicializacaoInicializacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoClasseTipo(ATipoClasseTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoPrimitivoTipo(ATipoPrimitivoTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntTipoPrimitivo(AIntTipoPrimitivo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABoolTipoPrimitivo(ABoolTipoPrimitivo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealTipoPrimitivo(ARealTipoPrimitivo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoClasse(ATipoClasse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecProcedimento(ADecProcedimento node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecFuncao(ADecFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVazioParametros(AVazioParametros node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametrosParametros(AParametrosParametros node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametro(AParametro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfOnlyComando(AIfOnlyComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComando1Comando(AComando1Comando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfElseComando1(AIfElseComando1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComando2Comando1(AComando2Comando1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhileComando2(AWhileComando2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComando3Comando2(AComando3Comando2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtrComando3(AAtrComando3 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaComando3(AChamadaComando3 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocoComando3(ABlocoComando3 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABloco(ABloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfExp(AIfExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExp1Exp(AExp1Exp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASubtExp1(ASubtExp1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAdcExp1(AAdcExp1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASubtPartExp1(ASubtPartExp1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExp1Exp1(AExp1Exp1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultExp2(AMultExp2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivExp2(ADivExp2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAModExp2(AModExp2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExp3Exp2(AExp3Exp2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualExp3(AIgualExp3 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorExp3(AMenorExp3 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExp4Exp3(AExp4Exp3 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAndExp4(AAndExp4 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOrExp4(AOrExp4 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExp5Exp4(AExp5Exp4 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANaoExp5(ANaoExp5 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExp6Exp5(AExp6Exp5 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealExp6(ARealExp6 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntExp6(AIntExp6 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATrueExp6(ATrueExp6 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFalseExp6(AFalseExp6 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParExp6(AParExp6 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtributoExp6(AAtributoExp6 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaExp6(AChamadaExp6 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocoExpExp6(ABlocoExpExp6 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocoExpBlocoExp(ABlocoExpBlocoExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaChamada(AChamadaChamada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdAtributo(AIdAtributo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVazioListaExp(AVazioListaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaExpListaExp(AListaExpListaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdPontoIdPontoAux(AIdPontoIdPontoAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVirgExpVirgExpAux(AVirgExpVirgExpAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVirgInicializacaoVirgInicializacaoAux(AVirgInicializacaoVirgInicializacaoAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVirgIdVirgIdAux(AVirgIdVirgIdAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecObjDecAux(ADecObjDecAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecVarDecAux(ADecVarDecAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecConsDecAux(ADecConsDecAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVirgParametroAux(AVirgParametroAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecProcedimentoMetodosAux(ADecProcedimentoMetodosAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecFuncaoMetodosAux(ADecFuncaoMetodosAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEComercialRelacaoFamiliaAux(AEComercialRelacaoFamiliaAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEComercial(TEComercial node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontoVirg(TPontoVirg node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTClasse(TClasse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFilhaClasse(TFilhaClasse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComeca(TComeca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTermina(TTermina node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTObj(TObj node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirg(TVirg node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVar(TVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCons(TCons node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAtr(TAtr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIntTipo(TIntTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBoolTipo(TBoolTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRealTipo(TRealTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDetProcInicial(TDetProcInicial node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProc(TProc node)
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
    public void caseTFunc(TFunc node)
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
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgualSimples(TIgualSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPonto(TPonto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBoolVerdadeiro(TBoolVerdadeiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBoolFalso(TBoolFalso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSubt(TSubt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEntao(TEntao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAdc(TAdc node)
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
    public void caseTIgualComp(TIgualComp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenor(TMenor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTELogico(TELogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOuLogico(TOuLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentario(TComentario node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCid(TCid node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVazio(TVazio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumInteiro(TNumInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumReal(TNumReal node)
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

/**
 * File: Py3ToLuaVisitor.java
 * Package: Lenguajes-Py3ToLua.py3ToLua.Py3ToLuaVisitor
 * Creation: 4/05/2015 at 12:04:29 p. m.
 */

package py3ToLua;

import grammar.*;
import grammar.Python3Parser.And_exprContext;
import grammar.Python3Parser.And_testContext;
import grammar.Python3Parser.ArglistCompound1Context;
import grammar.Python3Parser.ArglistCompound2Context;
import grammar.Python3Parser.ArglistCompound3Context;
import grammar.Python3Parser.ArglistContext;
import grammar.Python3Parser.Argument1Context;
import grammar.Python3Parser.Argument2Context;
import grammar.Python3Parser.Arith_exprContext;
import grammar.Python3Parser.Arith_opContext;
import grammar.Python3Parser.Assert_stmtContext;
import grammar.Python3Parser.Atom1Context;
import grammar.Python3Parser.Atom2Context;
import grammar.Python3Parser.Atom3Context;
import grammar.Python3Parser.AtomDirectContext;
import grammar.Python3Parser.AtomNameContext;
import grammar.Python3Parser.AugassignContext;
import grammar.Python3Parser.Break_stmtContext;
import grammar.Python3Parser.ClassdefContext;
import grammar.Python3Parser.Comp_forContext;
import grammar.Python3Parser.Comp_ifContext;
import grammar.Python3Parser.Comp_iterContext;
import grammar.Python3Parser.Comp_opContext;
import grammar.Python3Parser.ComparisonContext;
import grammar.Python3Parser.Compound_stmtContext;
import grammar.Python3Parser.Continue_stmtContext;
import grammar.Python3Parser.DecoratedContext;
import grammar.Python3Parser.DecoratorContext;
import grammar.Python3Parser.DecoratorsContext;
import grammar.Python3Parser.Del_stmtContext;
import grammar.Python3Parser.Dictorsetmaker1Context;
import grammar.Python3Parser.Dictorsetmaker2Context;
import grammar.Python3Parser.Dotted_as_nameContext;
import grammar.Python3Parser.Dotted_as_namesContext;
import grammar.Python3Parser.Dotted_nameContext;
import grammar.Python3Parser.Eval_inputContext;
import grammar.Python3Parser.Except_clauseContext;
import grammar.Python3Parser.ExprContext;
import grammar.Python3Parser.Expr_stmtComplement1Context;
import grammar.Python3Parser.Expr_stmtComplement2Context;
import grammar.Python3Parser.Expr_stmtContext;
import grammar.Python3Parser.ExprlistContext;
import grammar.Python3Parser.FactorContext;
import grammar.Python3Parser.Factor_prefixContext;
import grammar.Python3Parser.File_inputContext;
import grammar.Python3Parser.Flow_stmtContext;
import grammar.Python3Parser.For_stmtContext;
import grammar.Python3Parser.FuncdefContext;
import grammar.Python3Parser.Global_stmtContext;
import grammar.Python3Parser.If_stmtContext;
import grammar.Python3Parser.Import_as_nameContext;
import grammar.Python3Parser.Import_as_namesContext;
import grammar.Python3Parser.Import_fromContext;
import grammar.Python3Parser.Import_nameContext;
import grammar.Python3Parser.Import_stmtContext;
import grammar.Python3Parser.IntegerContext;
import grammar.Python3Parser.LambdefContext;
import grammar.Python3Parser.Lambdef_nocondContext;
import grammar.Python3Parser.Nonlocal_stmtContext;
import grammar.Python3Parser.Not_testContext;
import grammar.Python3Parser.NumberContext;
import grammar.Python3Parser.Or_testContext;
import grammar.Python3Parser.ParametersContext;
import grammar.Python3Parser.Pass_stmtContext;
import grammar.Python3Parser.PowerContext;
import grammar.Python3Parser.Raise_stmtContext;
import grammar.Python3Parser.Return_stmtContext;
import grammar.Python3Parser.Shift_exprContext;
import grammar.Python3Parser.Shift_opContext;
import grammar.Python3Parser.Simple_stmtContext;
import grammar.Python3Parser.Single_inputContext;
import grammar.Python3Parser.SliceopContext;
import grammar.Python3Parser.Small_stmtContext;
import grammar.Python3Parser.Star_exprContext;
import grammar.Python3Parser.StmtContext;
import grammar.Python3Parser.StringContext;
import grammar.Python3Parser.SubscriptSliceContext;
import grammar.Python3Parser.SubscriptTestContext;
import grammar.Python3Parser.SubscriptlistContext;
import grammar.Python3Parser.SuiteContext;
import grammar.Python3Parser.TermContext;
import grammar.Python3Parser.Term_opContext;
import grammar.Python3Parser.TestContext;
import grammar.Python3Parser.Test_nocondContext;
import grammar.Python3Parser.TestlistContext;
import grammar.Python3Parser.Testlist_compContext;
import grammar.Python3Parser.Testlist_star_exprContext;
import grammar.Python3Parser.Testorstar_exprContext;
import grammar.Python3Parser.TfpassignContext;
import grammar.Python3Parser.TfpdefContext;
import grammar.Python3Parser.Trailer1Context;
import grammar.Python3Parser.Trailer2Context;
import grammar.Python3Parser.Trailer3Context;
import grammar.Python3Parser.Try_stmtContext;
import grammar.Python3Parser.TypedargsdContext;
import grammar.Python3Parser.Typedargslist1Context;
import grammar.Python3Parser.Typedargslist2Context;
import grammar.Python3Parser.Typedargsv1Context;
import grammar.Python3Parser.Typedargsv2Context;
import grammar.Python3Parser.VarargsdContext;
import grammar.Python3Parser.Varargslist1Context;
import grammar.Python3Parser.Varargslist2Context;
import grammar.Python3Parser.Varargsv1Context;
import grammar.Python3Parser.Varargsv2Context;
import grammar.Python3Parser.VfpassignContext;
import grammar.Python3Parser.VfpdefContext;
import grammar.Python3Parser.While_stmtContext;
import grammar.Python3Parser.With_itemContext;
import grammar.Python3Parser.With_stmtContext;
import grammar.Python3Parser.Xor_exprContext;
import grammar.Python3Parser.Yield_argContext;
import grammar.Python3Parser.Yield_exprContext;
import grammar.Python3Parser.Yield_stmtContext;
import grammar.Python3Parser.Yieldortestlist_star_exprContext;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author camiloasc1
 *
 */
public class Py3ToLuaVisitor extends Python3BaseVisitor<String>
{
    private int indent = 0;
    private String currentClass;
    private String currentAssign;
    private HashMap<String, String> classes = new LinkedHashMap<String, String>();

    private String getIndent()
    {
        String indentStr = "";
        for (int i = 0; i < indent; i++)
        {
            indentStr += "    ";
        }
        return indentStr;
    }

    private <T extends ParseTree> String listVisit(List<T> list, String sep)
    {
        String trad = "";
        for (Iterator<T> it = list.iterator(); it.hasNext();)
        {
            trad += visit(it.next());
            if (it.hasNext())
            {
                trad += sep;
            }
        }
        return trad;
    }

    private <T extends ParseTree, S extends ParseTree> String listVisit(List<T> list, List<S> sep)
    {
        int count = 0;
        String trad = "";
        for (Iterator<T> it = list.iterator(); it.hasNext();)
        {
            trad += visit(it.next());
            if (it.hasNext())
            {
                trad += visit(sep.get(count++));
            }
        }
        return trad;
    }

    @SuppressWarnings("unused")
    private <T extends ParseTree> String listGetText(List<T> list, String sep)
    {
        String trad = "";
        for (Iterator<T> it = list.iterator(); it.hasNext();)
        {
            trad += it.next().getText();
            if (it.hasNext())
            {
                trad += sep;
            }
        }
        return trad;
    }

    public static void error(Token token, String errMsg)
    {
        System.err.println("Error: line " + token.getLine() + ":" + token.getCharPositionInLine() + " " + errMsg);
    }

    public static void warn(Token token, String errMsg)
    {
        System.err.println("Warning: line " + token.getLine() + ":" + token.getCharPositionInLine() + " " + errMsg);
    }
    
    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitSingle_input(grammar.Python3Parser.Single_inputContext)
     */
    @Override
    public String visitSingle_input(Single_inputContext ctx)
    {
        if (ctx.simple_stmt() != null)
            return visitSimple_stmt(ctx.simple_stmt()) + "\n";// check if is best append ";"
        else if (ctx.compound_stmt() != null)
            return visitCompound_stmt(ctx.compound_stmt()) + "\n";
        return "";
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitFile_input(grammar.Python3Parser.File_inputContext)
     */
    @Override
    public String visitFile_input(File_inputContext ctx)
    {
        // String trad = "";
        // for (StmtContext stmt : ctx.stmt())
        // {
        // trad += visitStmt(stmt) + "\n";
        // }
        // return trad;
        return listVisit(ctx.stmt(), "\n");
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitEval_input(grammar.Python3Parser.Eval_inputContext)
     */
    @Override
    public String visitEval_input(Eval_inputContext ctx)
    {
        return visitTestlist(ctx.testlist()) + "\n";
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitDecorator(grammar.Python3Parser.DecoratorContext)
     */
    @Override
    public String visitDecorator(DecoratorContext ctx)
    {
        warn(ctx.getStart(), "Decorators not supported");
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitDecorators(grammar.Python3Parser.DecoratorsContext)
     */
    @Override
    public String visitDecorators(DecoratorsContext ctx)
    {
        warn(ctx.getStart(), "Decorators not supported");
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitDecorated(grammar.Python3Parser.DecoratedContext)
     */
    @Override
    public String visitDecorated(DecoratedContext ctx)
    {
        if (ctx.classdef() != null)
            return visitClassdef(ctx.classdef());
        else
            // if (ctx.funcdef() != null)
            return visitFuncdef(ctx.funcdef());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitFuncdef(grammar.Python3Parser.FuncdefContext)
     */
    @Override
    public String visitFuncdef(FuncdefContext ctx)
    {
        if (ctx.test() != null)
        {
            warn(ctx.test().getStart(), "Decorators not supported");
        }
        String funcName = ctx.NAME().getText();
        switch (funcName)
        {
            case "__init__":
                if (Flags.get(Flags.CLASS))
                {
                    Flags.set(Flags.NEW);
                    funcName = currentClass + ".new";
                }
                break;

            default:
                if (Flags.get(Flags.CLASS))
                {
                    funcName = currentClass + "." + funcName;
                }
                break;
        }
        String trad = "";
        trad += "function " + funcName + visitParameters(ctx.parameters()) + "\n";

        if (Flags.get(Flags.NEW))
        {
            indent++;
            trad += getIndent() + "local self = {}\n";
            trad += getIndent() + "setmetatable(self, " + currentClass + ")\n";
            indent--;
        }

        trad += visitSuite(ctx.suite());

        if (Flags.get(Flags.NEW))
        {
            indent++;
            trad += getIndent() + "return self\n";
            indent--;
        }

        trad += getIndent() + "end";

        Flags.clear(Flags.NEW);
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitParameters(grammar.Python3Parser.ParametersContext)
     */
    @Override
    public String visitParameters(ParametersContext ctx)
    {
        String trad = "";
        trad += "(";
        if (ctx.typedargslist() != null)
        {
            trad += visit(ctx.typedargslist());
        }
        trad += ")";
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitTypedargslist(grammar.Python3Parser.TypedargslistContext)
     */
    @Override
    public String visitTypedargslist1(Typedargslist1Context ctx)
    {
        String trad = "";
        trad += listVisit(ctx.tfpassign(), ", ");
        if (ctx.typedargsv() != null)
        {
            trad += ", " + visit(ctx.typedargsv());
        }
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitTypedargslist2(grammar.Python3Parser.Typedargslist2Context)
     */
    @Override
    public String visitTypedargslist2(Typedargslist2Context ctx)
    {
        return visit(ctx.typedargsv());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitTypedargsv1(grammar.Python3Parser.Typedargsv1Context)
     */
    @Override
    public String visitTypedargsv1(Typedargsv1Context ctx)
    {
        if (ctx.tfpassign() != null)
        {
            warn(ctx.tfpassign(0).getStart(), "Named arguments not supported");
        }
        return "...";
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitTypedargsv2(grammar.Python3Parser.Typedargsv2Context)
     */
    @Override
    public String visitTypedargsv2(Typedargsv2Context ctx)
    {
        return visitTypedargsd(ctx.typedargsd());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitTypedargsd(grammar.Python3Parser.TypedargsdContext)
     */
    @Override
    public String visitTypedargsd(TypedargsdContext ctx)
    {
        return "...";
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitTfpassign(grammar.Python3Parser.TfpassignContext)
     */
    @Override
    public String visitTfpassign(TfpassignContext ctx)
    {
        String trad = "";
        trad += visitTfpdef(ctx.tfpdef());
        if (ctx.test() != null)
        {
            trad += " = " + visitTest(ctx.test());
        }
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitTfpdef(grammar.Python3Parser.TfpdefContext)
     */
    @Override
    public String visitTfpdef(TfpdefContext ctx)
    {
        if (ctx.test() != null)
        {
            warn(ctx.test().getStart(), "Decorators not supported");
        }
        return ctx.NAME().getText();
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitVarargslist1(grammar.Python3Parser.Varargslist1Context)
     */
    @Override
    public String visitVarargslist1(Varargslist1Context ctx)
    {
        String trad = "";
        trad += listVisit(ctx.vfpassign(), ", ");
        if (ctx.vfpassign() != null)
        {
            trad += ", " + visit(ctx.varargsv());
        }
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitVarargslist2(grammar.Python3Parser.Varargslist2Context)
     */
    @Override
    public String visitVarargslist2(Varargslist2Context ctx)
    {
        return visit(ctx.varargsv());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitVarargsv(grammar.Python3Parser.VarargsvContext)
     */
    @Override
    public String visitVarargsv1(Varargsv1Context ctx)
    {
        if (ctx.vfpassign() != null)
        {
            warn(ctx.vfpassign(0).getStart(), "Named arguments not supported");
        }
        return "...";
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitVarargsv2(grammar.Python3Parser.Varargsv2Context)
     */
    @Override
    public String visitVarargsv2(Varargsv2Context ctx)
    {
        return visitVarargsd(ctx.varargsd());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitVarargsd(grammar.Python3Parser.VarargsdContext)
     */
    @Override
    public String visitVarargsd(VarargsdContext ctx)
    {
        return "...";
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitVfpassign(grammar.Python3Parser.VfpassignContext)
     */
    @Override
    public String visitVfpassign(VfpassignContext ctx)
    {
        String trad = "";
        trad += visitVfpdef(ctx.vfpdef());
        if (ctx.test() != null)
        {
            trad += " = " + visitTest(ctx.test());
        }
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitVfpdef(grammar.Python3Parser.VfpdefContext)
     */
    @Override
    public String visitVfpdef(VfpdefContext ctx)
    {
        return ctx.NAME().getText();
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitStmt(grammar.Python3Parser.StmtContext)
     */
    @Override
    public String visitStmt(StmtContext ctx)
    {
        if (ctx.simple_stmt() != null)
            return visitSimple_stmt(ctx.simple_stmt());
        else
            return visitCompound_stmt(ctx.compound_stmt());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitSimple_stmt(grammar.Python3Parser.Simple_stmtContext)
     */
    @Override
    public String visitSimple_stmt(Simple_stmtContext ctx)
    {
        return listVisit(ctx.small_stmt(), "; ");
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitSmall_stmt(grammar.Python3Parser.Small_stmtContext)
     */
    @Override
    public String visitSmall_stmt(Small_stmtContext ctx)
    {
        if (ctx.expr_stmt() != null)
            return visitExpr_stmt(ctx.expr_stmt());
        if (ctx.del_stmt() != null)
            return visitDel_stmt(ctx.del_stmt());
        if (ctx.pass_stmt() != null)
            return visitPass_stmt(ctx.pass_stmt());
        if (ctx.flow_stmt() != null)
            return visitFlow_stmt(ctx.flow_stmt());
        if (ctx.import_stmt() != null)
            return visitImport_stmt(ctx.import_stmt());
        if (ctx.global_stmt() != null)
            return visitGlobal_stmt(ctx.global_stmt());
        if (ctx.nonlocal_stmt() != null)
            return visitNonlocal_stmt(ctx.nonlocal_stmt());
        else
            return visitAssert_stmt(ctx.assert_stmt());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitExpr_stmt(grammar.Python3Parser.Expr_stmtContext)
     */
    @Override
    public String visitExpr_stmt(Expr_stmtContext ctx)
    {
        String leftAssign = visitTestlist_star_expr(ctx.testlist_star_expr());
        String rightTrad = visit(ctx.expr_stmtComplement());
        if (Flags.get(Flags.ASSIGNOP))
        {
            String trad = leftAssign + " = " + leftAssign + " " + currentAssign + " (" + rightTrad + ")";
            Flags.clear(Flags.ASSIGNOP);
            currentAssign = null;
            return trad;
        }
        return leftAssign + rightTrad;
    }
    
    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitExpr_stmtComplement1(grammar.Python3Parser.Expr_stmtComplement1Context)
     */
    @Override
    public String visitExpr_stmtComplement1(Expr_stmtComplement1Context ctx)
    {
        String trad = "";
        if (ctx.augassign().getText().compareTo("@=") == 0)
        {
            error(ctx.getStart(), "operator '@=' not supported");
            return "";
        }
        Flags.set(Flags.ASSIGNOP);
        currentAssign = ctx.getText().charAt(0) + "";
        if (ctx.yield_expr() != null)
        {
            trad += visitYield_expr(ctx.yield_expr());
        }
        else
        {
            trad += visitTestlist(ctx.testlist());
        }
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitExpr_stmtComplement2(grammar.Python3Parser.Expr_stmtComplement2Context)
     */
    @Override
    public String visitExpr_stmtComplement2(Expr_stmtComplement2Context ctx)
    {
        String trad = "";
        for (Yieldortestlist_star_exprContext i : ctx.yieldortestlist_star_expr())
        {
            trad += " = " + visitYieldortestlist_star_expr(i);
        }
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitYieldortestlist_star_expr(grammar.Python3Parser.Yieldortestlist_star_exprContext)
     */
    @Override
    public String visitYieldortestlist_star_expr(Yieldortestlist_star_exprContext ctx)
    {
        if (ctx.yield_expr() != null)
            return visitYield_expr(ctx.yield_expr());
        else
            return visitTestlist_star_expr(ctx.testlist_star_expr());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitTestlist_star_expr(grammar.Python3Parser.Testlist_star_exprContext)
     */
    @Override
    public String visitTestlist_star_expr(Testlist_star_exprContext ctx)
    {
        return listVisit(ctx.testorstar_expr(), ", ");
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitTestorstar_expr(grammar.Python3Parser.Testorstar_exprContext)
     */
    @Override
    public String visitTestorstar_expr(Testorstar_exprContext ctx)
    {
        if (ctx.test() != null)
            return visitTest(ctx.test());
        else
            return visitStar_expr(ctx.star_expr());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitAugassign(grammar.Python3Parser.AugassignContext)
     */
    @Override
    public String visitAugassign(AugassignContext ctx)
    {
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitDel_stmt(grammar.Python3Parser.Del_stmtContext)
     */
    @Override
    public String visitDel_stmt(Del_stmtContext ctx)
    {
        error(ctx.getStart(), "Delete statement not supported");
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitPass_stmt(grammar.Python3Parser.Pass_stmtContext)
     */
    @Override
    public String visitPass_stmt(Pass_stmtContext ctx)
    {
        // Empy stmt
        // return "do ; end";
        return ";";
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitFlow_stmt(grammar.Python3Parser.Flow_stmtContext)
     */
    @Override
    public String visitFlow_stmt(Flow_stmtContext ctx)
    {
        if (ctx.break_stmt() != null)
            return visitBreak_stmt(ctx.break_stmt());
        if (ctx.continue_stmt() != null)
            return visitContinue_stmt(ctx.continue_stmt());
        if (ctx.return_stmt() != null)
            return visitReturn_stmt(ctx.return_stmt());
        if (ctx.raise_stmt() != null)
            return visitRaise_stmt(ctx.raise_stmt());
        else
            return visitYield_stmt(ctx.yield_stmt());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitBreak_stmt(grammar.Python3Parser.Break_stmtContext)
     */
    @Override
    public String visitBreak_stmt(Break_stmtContext ctx)
    {
        return "break";
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitContinue_stmt(grammar.Python3Parser.Continue_stmtContext)
     */
    @Override
    public String visitContinue_stmt(Continue_stmtContext ctx)
    {
        return "continue";
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitReturn_stmt(grammar.Python3Parser.Return_stmtContext)
     */
    @Override
    public String visitReturn_stmt(Return_stmtContext ctx)
    {
        String trad = "";
        trad += "return ";
        if (ctx.testlist() != null)
        {
            trad += visitTestlist(ctx.testlist());
        }
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitYield_stmt(grammar.Python3Parser.Yield_stmtContext)
     */
    @Override
    public String visitYield_stmt(Yield_stmtContext ctx)
    {
        return visitYield_expr(ctx.yield_expr());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitRaise_stmt(grammar.Python3Parser.Raise_stmtContext)
     */
    @Override
    public String visitRaise_stmt(Raise_stmtContext ctx)
    {
        if (ctx.FROM() != null)
        {
            error(ctx.getStart(), "raise from statement not supported");
        }
        return "error(" + visitTest(ctx.test(0)) + ")";
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitImport_stmt(grammar.Python3Parser.Import_stmtContext)
     */
    @Override
    public String visitImport_stmt(Import_stmtContext ctx)
    {
        // Import not needed
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitImport_name(grammar.Python3Parser.Import_nameContext)
     */
    @Override
    public String visitImport_name(Import_nameContext ctx)
    {
        // Import not needed
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitImport_from(grammar.Python3Parser.Import_fromContext)
     */
    @Override
    public String visitImport_from(Import_fromContext ctx)
    {
        // Import not needed
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitImport_as_name(grammar.Python3Parser.Import_as_nameContext)
     */
    @Override
    public String visitImport_as_name(Import_as_nameContext ctx)
    {
        // Import not needed
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitDotted_as_name(grammar.Python3Parser.Dotted_as_nameContext)
     */
    @Override
    public String visitDotted_as_name(Dotted_as_nameContext ctx)
    {
        // Import not needed
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitImport_as_names(grammar.Python3Parser.Import_as_namesContext)
     */
    @Override
    public String visitImport_as_names(Import_as_namesContext ctx)
    {
        // Import not needed
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitDotted_as_names(grammar.Python3Parser.Dotted_as_namesContext)
     */
    @Override
    public String visitDotted_as_names(Dotted_as_namesContext ctx)
    {
        // Import not needed
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitDotted_name(grammar.Python3Parser.Dotted_nameContext)
     */
    @Override
    public String visitDotted_name(Dotted_nameContext ctx)
    {
        // Import not needed
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitGlobal_stmt(grammar.Python3Parser.Global_stmtContext)
     */
    @Override
    public String visitGlobal_stmt(Global_stmtContext ctx)
    {
        // global statement not required
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitNonlocal_stmt(grammar.Python3Parser.Nonlocal_stmtContext)
     */
    @Override
    public String visitNonlocal_stmt(Nonlocal_stmtContext ctx)
    {
        // nonlocal statement not required
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitAssert_stmt(grammar.Python3Parser.Assert_stmtContext)
     */
    @Override
    public String visitAssert_stmt(Assert_stmtContext ctx)
    {
        return "assert(" + listVisit(ctx.test(), " and ") + ")";
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitCompound_stmt(grammar.Python3Parser.Compound_stmtContext)
     */
    @Override
    public String visitCompound_stmt(Compound_stmtContext ctx)
    {
        if (ctx.if_stmt() != null)
            return visitIf_stmt(ctx.if_stmt());
        if (ctx.while_stmt() != null)
            return visitWhile_stmt(ctx.while_stmt());
        if (ctx.for_stmt() != null)
            return visitFor_stmt(ctx.for_stmt());
        if (ctx.try_stmt() != null)
            return visitTry_stmt(ctx.try_stmt());
        if (ctx.with_stmt() != null)
            return visitWith_stmt(ctx.with_stmt());
        if (ctx.funcdef() != null)
            return visitFuncdef(ctx.funcdef());
        if (ctx.classdef() != null)
            return visitClassdef(ctx.classdef());
        else
            return visitDecorated(ctx.decorated());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitIf_stmt(grammar.Python3Parser.If_stmtContext)
     */
    @Override
    public String visitIf_stmt(If_stmtContext ctx)
    {
        int blockCount = 0;
        String trad = "";
        trad += "if " + visitTest(ctx.test(blockCount)) + " then\n";
        trad += visitSuite(ctx.suite(blockCount++));
        for (int i = 0; i < ctx.ELIF().size(); i++)
        {
            trad += getIndent() + "elseif " + visitTest(ctx.test(blockCount)) + " then\n";
            trad += visitSuite(ctx.suite(blockCount++));
        }
        if (ctx.ELSE() != null)
        {
            trad += getIndent() + "else\n";
            trad += visitSuite(ctx.suite(blockCount++));
        }
        trad += getIndent() + "end";
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitWhile_stmt(grammar.Python3Parser.While_stmtContext)
     */
    @Override
    public String visitWhile_stmt(While_stmtContext ctx)
    {
        String trad = "";
        trad += "while " + visitTest(ctx.test()) + " do\n";
        trad += visitSuite(ctx.suite(0));
        if (ctx.ELSE() != null)
        {
            trad += getIndent() + "if not(" + visitTest(ctx.test()) + ") then";
            trad += visitSuite(ctx.suite(1));
            trad += getIndent() + "break";
            trad += getIndent() + "end";
        }
        trad += getIndent() + "end";
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitFor_stmt(grammar.Python3Parser.For_stmtContext)
     */
    @Override
    public String visitFor_stmt(For_stmtContext ctx)
    {
        String trad = "";
        String testListTrad = visitTestlist(ctx.testlist());
        trad += "for " + visitExprlist(ctx.exprlist());
        if (Flags.get(Flags.RANGEFOR))
        {
            Flags.clear(Flags.RANGEFOR);
            trad += " = ";
        }
        else
        {
            trad += " in ";
        }
        trad += testListTrad + " do\n";
        trad += visitSuite(ctx.suite(0));
        if (ctx.ELSE() != null)
        {
            error(ctx.ELSE().getSymbol(), "for - else statement not supported");
        }
        trad += getIndent() + "end";
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitTry_stmt(grammar.Python3Parser.Try_stmtContext)
     */
    @Override
    public String visitTry_stmt(Try_stmtContext ctx)
    {
        error(ctx.getStart(), "try statement not supported");
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitWith_stmt(grammar.Python3Parser.With_stmtContext)
     */
    @Override
    public String visitWith_stmt(With_stmtContext ctx)
    {
        error(ctx.getStart(), "with statement not supported");
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitWith_item(grammar.Python3Parser.With_itemContext)
     */
    @Override
    public String visitWith_item(With_itemContext ctx)
    {
        error(ctx.getStart(), "with statement not supported");
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitExcept_clause(grammar.Python3Parser.Except_clauseContext)
     */
    @Override
    public String visitExcept_clause(Except_clauseContext ctx)
    {
        error(ctx.getStart(), "try statement not supported");
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitSuite(grammar.Python3Parser.SuiteContext)
     */
    @Override
    public String visitSuite(SuiteContext ctx)
    {
        String trad = "";
        indent++;
        if (ctx.simple_stmt() != null)
        {
            String stmtTrad = visitSimple_stmt(ctx.simple_stmt());
            if (stmtTrad != null)
            {
                trad += getIndent() + stmtTrad + "\n";
            }
        }
        else
        {
            for (StmtContext stmt : ctx.stmt())
            {
                String stmtTrad = visit(stmt);
                if (stmtTrad != null)
                {
                    trad += getIndent() + stmtTrad + "\n";
                }
            }
        }
        indent--;
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitTest(grammar.Python3Parser.TestContext)
     */
    @Override
    public String visitTest(TestContext ctx)
    {
        if (ctx == null)
            return null;
        if (ctx.lambdef() != null)
            return visitLambdef(ctx.lambdef());

        String trad = "";
        trad += visitOr_test(ctx.or_test(0));
        if (ctx.IF() != null)
        {
            trad += " and " + visitOr_test(ctx.or_test(1)) + " or " + visitTest(ctx.test());
        }
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitTest_nocond(grammar.Python3Parser.Test_nocondContext)
     */
    @Override
    public String visitTest_nocond(Test_nocondContext ctx)
    {
        if (ctx.or_test() != null)
            return visitOr_test(ctx.or_test());
        return visitLambdef_nocond(ctx.lambdef_nocond());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitLambdef(grammar.Python3Parser.LambdefContext)
     */
    @Override
    public String visitLambdef(LambdefContext ctx)
    {
        return "function (" + visit(ctx.varargslist()) + ")" + visitTest(ctx.test()) + "end";
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitLambdef_nocond(grammar.Python3Parser.Lambdef_nocondContext)
     */
    @Override
    public String visitLambdef_nocond(Lambdef_nocondContext ctx)
    {
        return "function (" + visit(ctx.varargslist()) + ")" + visitTest_nocond(ctx.test_nocond()) + "end";
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitOr_test(grammar.Python3Parser.Or_testContext)
     */
    @Override
    public String visitOr_test(Or_testContext ctx)
    {
        return listVisit(ctx.and_test(), " or ");
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitAnd_test(grammar.Python3Parser.And_testContext)
     */
    @Override
    public String visitAnd_test(And_testContext ctx)
    {
        return listVisit(ctx.not_test(), " and ");
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitNot_test(grammar.Python3Parser.Not_testContext)
     */
    @Override
    public String visitNot_test(Not_testContext ctx)
    {
        if (ctx.NOT() != null)
            return "not " + visitNot_test(ctx.not_test());
        return visitComparison(ctx.comparison());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitComparison(grammar.Python3Parser.ComparisonContext)
     */
    @Override
    public String visitComparison(ComparisonContext ctx)
    {
        return listVisit(ctx.expr(), ctx.comp_op());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitComp_op(grammar.Python3Parser.Comp_opContext)
     */
    @Override
    public String visitComp_op(Comp_opContext ctx)
    {
        // TODO check last cases
        String trad = "";
        switch (ctx.getText())
        {
            case "!=":
                trad = "~=";
                break;
            case "is":
                trad = "==";
                break;
            case "is not":
                trad = "~=";
                break;
            
            default:
                trad = ctx.getText();
                break;
        }
        return " " + trad + " ";
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitStar_expr(grammar.Python3Parser.Star_exprContext)
     */
    @Override
    public String visitStar_expr(Star_exprContext ctx)
    {
        return ((ctx.start.getText().compareTo("*") == 0) ? "* " : "") + visitExpr(ctx.expr());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitExpr(grammar.Python3Parser.ExprContext)
     */
    @Override
    public String visitExpr(ExprContext ctx)
    {
        return listVisit(ctx.xor_expr(), " | ");
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitXor_expr(grammar.Python3Parser.Xor_exprContext)
     */
    @Override
    public String visitXor_expr(Xor_exprContext ctx)
    {
        return listVisit(ctx.and_expr(), " ^ ");
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitAnd_expr(grammar.Python3Parser.And_exprContext)
     */
    @Override
    public String visitAnd_expr(And_exprContext ctx)
    {
        return listVisit(ctx.shift_expr(), " & ");
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitShift_expr(grammar.Python3Parser.Shift_exprContext)
     */
    @Override
    public String visitShift_expr(Shift_exprContext ctx)
    {
        return listVisit(ctx.arith_expr(), ctx.shift_op());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitShift_op(grammar.Python3Parser.Shift_opContext)
     */
    @Override
    public String visitShift_op(Shift_opContext ctx)
    {
        return " " + ctx.getText() + " ";
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitArith_expr(grammar.Python3Parser.Arith_exprContext)
     */
    @Override
    public String visitArith_expr(Arith_exprContext ctx)
    {
        return listVisit(ctx.term(), ctx.arith_op());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitArith_op(grammar.Python3Parser.Arith_opContext)
     */
    @Override
    public String visitArith_op(Arith_opContext ctx)
    {
        return " " + ctx.getText() + " ";
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitTerm(grammar.Python3Parser.TermContext)
     */
    @Override
    public String visitTerm(TermContext ctx)
    {
        return listVisit(ctx.factor(), ctx.term_op());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitTerm_op(grammar.Python3Parser.Term_opContext)
     */
    @Override
    public String visitTerm_op(Term_opContext ctx)
    {
        if (ctx.getText().compareTo("@") == 0)
        {
            error(ctx.getStart(), "operator '@' not supported");
            return null;
        }
        return " " + ctx.getText() + " ";
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitFactor(grammar.Python3Parser.FactorContext)
     */
    @Override
    public String visitFactor(FactorContext ctx)
    {
        if (ctx.factor() != null)
            return visitFactor_prefix(ctx.factor_prefix()) + visitFactor(ctx.factor());
        return visitPower(ctx.power());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitFactor_prefix(grammar.Python3Parser.Factor_prefixContext)
     */
    @Override
    public String visitFactor_prefix(Factor_prefixContext ctx)
    {
        return ctx.getText();
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitPower(grammar.Python3Parser.PowerContext)
     */
    @Override
    public String visitPower(PowerContext ctx)
    {
        String trad = "";
        trad += visit(ctx.atom()) + listVisit(ctx.trailer(), "");
        if (ctx.factor() != null)
        {
            trad += " ** " + visitFactor(ctx.factor());
        }
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitAtom1(grammar.Python3Parser.Atom1Context)
     */
    @Override
    public String visitAtom1(Atom1Context ctx)
    {
        String trad = "";
        trad += "(";
        if (ctx.yield_expr() != null)
        {
            trad += visitYield_expr(ctx.yield_expr());
        }
        else
        {
            trad += visitTestlist_comp(ctx.testlist_comp());
        }
        trad += ")";
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitAtom2(grammar.Python3Parser.Atom2Context)
     */
    @Override
    public String visitAtom2(Atom2Context ctx)
    {
        String trad = "";
        trad += "[";
        if (ctx.testlist_comp() != null)
        {
            trad += visitTestlist_comp(ctx.testlist_comp());
        }
        trad += "]";
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitAtom3(grammar.Python3Parser.Atom3Context)
     */
    @Override
    public String visitAtom3(Atom3Context ctx)
    {
        String trad = "";
        trad += "{";
        if (ctx.dictorsetmaker() != null)
        {
            trad += visit(ctx.dictorsetmaker());
        }
        trad += "}";
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitAtomName(grammar.Python3Parser.AtomNameContext)
     */
    @Override
    public String visitAtomName(AtomNameContext ctx)
    {
        String name = ctx.getText();
        if ((name.compareToIgnoreCase("range") == 0) || (name.compareToIgnoreCase("xrange") == 0))
        {
            Flags.set(Flags.RANGEFUNC);
            Flags.set(Flags.RANGEFOR);
            return "";
        }
        if (Python.isFunction(name))
        {
            warn(ctx.NAME().getSymbol(), "Warning: Python lib is not fully supported");
            String trad = Python.functionTrad(name);
            if (trad == null)
                return "-- " + name;
            return trad;
        }
        if (classes.containsKey(name))
            return name + ":new";
        return name;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitAtomDirect(grammar.Python3Parser.AtomDirectContext)
     */
    @Override
    public String visitAtomDirect(AtomDirectContext ctx)
    {
        return ctx.getText();
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitTestlist_comp(grammar.Python3Parser.Testlist_compContext)
     */
    @Override
    public String visitTestlist_comp(Testlist_compContext ctx)
    {
        String trad = "";
        trad += visitTest(ctx.test());
        if (ctx.comp_for() != null)
        {
            trad += visitComp_for(ctx.comp_for());
        }
        else if (ctx.testlist() != null)
        {
            trad += ", " + visitTestlist(ctx.testlist());
        }
        return trad;
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see grammar.Python3BaseVisitor#visitTrailer1(grammar.Python3Parser.Trailer1Context)
     */
    @Override
    public String visitTrailer1(Trailer1Context ctx)
    {
        if (ctx.arglist() != null)
        {
            if (Flags.get(Flags.RANGEFUNC))
            {
                Flags.clear(Flags.RANGEFUNC);
                return visitArglist(ctx.arglist());
            }
            return "(" + visitArglist(ctx.arglist()) + ")";
        }
        return "()";
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see grammar.Python3BaseVisitor#visitTrailer2(grammar.Python3Parser.Trailer2Context)
     */
    @Override
    public String visitTrailer2(Trailer2Context ctx)
    {
        if (ctx.subscriptlist() != null)
            return "[" + visitSubscriptlist(ctx.subscriptlist()) + "]";
        return "[]";
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see grammar.Python3BaseVisitor#visitTrailer3(grammar.Python3Parser.Trailer3Context)
     */
    @Override
    public String visitTrailer3(Trailer3Context ctx)
    {
        // return ":" + ctx.NAME().getText();
        return "." + ctx.NAME().getText();
    }
    
    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitSubscriptlist(grammar.Python3Parser.SubscriptlistContext)
     */
    @Override
    public String visitSubscriptlist(SubscriptlistContext ctx)
    {
        return listVisit(ctx.subscript(), ", ");
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitSubscriptTest(grammar.Python3Parser.SubscriptTestContext)
     */
    @Override
    public String visitSubscriptTest(SubscriptTestContext ctx)
    {
        return visitTest(ctx.test());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitSubscriptSlice(grammar.Python3Parser.SubscriptSliceContext)
     */
    @Override
    public String visitSubscriptSlice(SubscriptSliceContext ctx)
    {
        error(ctx.getStart(), "slice notation not supported");
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitSliceop(grammar.Python3Parser.SliceopContext)
     */
    @Override
    public String visitSliceop(SliceopContext ctx)
    {
        error(ctx.getStart(), "slice notation not supported");
        return super.visitSliceop(ctx);
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitExprlist(grammar.Python3Parser.ExprlistContext)
     */
    @Override
    public String visitExprlist(ExprlistContext ctx)
    {
        return listVisit(ctx.star_expr(), ", ");
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitTestlist(grammar.Python3Parser.TestlistContext)
     */
    @Override
    public String visitTestlist(TestlistContext ctx)
    {
        return listVisit(ctx.test(), ", ");
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitDictorsetmaker1(grammar.Python3Parser.Dictorsetmaker1Context)
     */
    @Override
    public String visitDictorsetmaker1(Dictorsetmaker1Context ctx)
    {
        if (ctx.comp_for() != null)
        {
            error(ctx.comp_for().getStart(), "List comprehensions not supported");
            return null;
        }
        String trad = "";
        for (Iterator<TestContext> it = ctx.test().iterator(); it.hasNext();)
        {
            trad += visitTest(it.next()) + " = " + visitTest(it.next());
            if (it.hasNext())
            {
                trad += ", ";
            }
        }
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitDictorsetmaker2(grammar.Python3Parser.Dictorsetmaker2Context)
     */
    @Override
    public String visitDictorsetmaker2(Dictorsetmaker2Context ctx)
    {
        if (ctx.comp_for() != null)
        {
            error(ctx.comp_for().getStart(), "List comprehensions not supported");
            return null;
        }
        // String trad = "";
        // for (Iterator<TestContext> it = ctx.test().iterator(); it.hasNext();)
        // {
        // trad += visitTest(it.next());
        // if (it.hasNext())
        // {
        // trad += ", ";
        // }
        // }
        return listVisit(ctx.test(), ", ");
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitClassdef(grammar.Python3Parser.ClassdefContext)
     */
    @Override
    public String visitClassdef(ClassdefContext ctx)
    {
        if (ctx.arglist() != null)
        {
            warn(ctx.arglist().getStart(), "Class inheritance not supported");
        }
        String trad = "";
        currentClass = ctx.NAME().getText();
        classes.put(currentClass, "");
        trad += currentClass + " = {};\n";
        trad += getIndent() + currentClass + ".__index = " + currentClass + ";\n";
        indent--;
        Flags.set(Flags.CLASS);
        trad += visitSuite(ctx.suite());
        Flags.clear(Flags.CLASS);
        currentClass = null;
        indent++;
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitArglist(grammar.Python3Parser.ArglistContext)
     */
    @Override
    public String visitArglist(ArglistContext ctx)
    {
        String trad = "";
        if (ctx.argument() != null)
        {
            trad += listVisit(ctx.argument(), ", ");
            if (ctx.argument().size() > 0)
            {
                trad += ", ";
            }
        }
        trad += visit(ctx.arglistCompound());
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitArglistCompound1(grammar.Python3Parser.ArglistCompound1Context)
     */
    @Override
    public String visitArglistCompound1(ArglistCompound1Context ctx)
    {
        return visit(ctx.argument());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitArglistCompound2(grammar.Python3Parser.ArglistCompound2Context)
     */
    @Override
    public String visitArglistCompound2(ArglistCompound2Context ctx)
    {
        return "...";
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitArglistCompound3(grammar.Python3Parser.ArglistCompound3Context)
     */
    @Override
    public String visitArglistCompound3(ArglistCompound3Context ctx)
    {
        return "...";
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitArgument1(grammar.Python3Parser.Argument1Context)
     */
    @Override
    public String visitArgument1(Argument1Context ctx)
    {
        return visitTest(ctx.test());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitArgument2(grammar.Python3Parser.Argument2Context)
     */
    @Override
    public String visitArgument2(Argument2Context ctx)
    {
        return visitTest(ctx.test(0)) + " = " + visitTest(ctx.test(1));
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitComp_iter(grammar.Python3Parser.Comp_iterContext)
     */
    @Override
    public String visitComp_iter(Comp_iterContext ctx)
    {
        if (ctx.comp_for() != null)
            return visitComp_for(ctx.comp_for());
        return visitComp_if(ctx.comp_if());
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitComp_for(grammar.Python3Parser.Comp_forContext)
     */
    @Override
    public String visitComp_for(Comp_forContext ctx)
    {
        String trad = "";
        trad += "for" + visitExprlist(ctx.exprlist()) + "in" + visitOr_test(ctx.or_test());
        if (ctx.comp_iter() != null)
        {
            trad += visitComp_iter(ctx.comp_iter());
        }
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitComp_if(grammar.Python3Parser.Comp_ifContext)
     */
    @Override
    public String visitComp_if(Comp_ifContext ctx)
    {
        String trad = "";
        trad += "if" + visitTest_nocond(ctx.test_nocond());
        if (ctx.comp_iter() != null)
        {
            trad += visitComp_iter(ctx.comp_iter());
        }
        return trad;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitYield_expr(grammar.Python3Parser.Yield_exprContext)
     */
    @Override
    public String visitYield_expr(Yield_exprContext ctx)
    {
        error(ctx.getStart(), "yield statement not supported");
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitYield_arg(grammar.Python3Parser.Yield_argContext)
     */
    @Override
    public String visitYield_arg(Yield_argContext ctx)
    {
        error(ctx.getStart(), "yield statement not supported");
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitString(grammar.Python3Parser.StringContext)
     */
    @Override
    public String visitString(StringContext ctx)
    {
        return ctx.getText();
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitNumber(grammar.Python3Parser.NumberContext)
     */
    @Override
    public String visitNumber(NumberContext ctx)
    {
        return ctx.getText();
    }

    /*
     * (non-Javadoc)
     *
     * @see grammar.Python3BaseVisitor#visitInteger(grammar.Python3Parser.IntegerContext)
     */
    @Override
    public String visitInteger(IntegerContext ctx)
    {
        return ctx.getText();
    }

}

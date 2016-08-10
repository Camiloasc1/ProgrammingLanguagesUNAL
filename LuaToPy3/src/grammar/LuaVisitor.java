// Generated from Lua.g4 by ANTLR 4.5

package grammar;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LuaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LuaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LuaParser#chunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChunk(LuaParser.ChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LuaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statSep}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatSep(LuaParser.StatSepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statVarAssign}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatVarAssign(LuaParser.StatVarAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statFunctCall}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatFunctCall(LuaParser.StatFunctCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statLabel}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatLabel(LuaParser.StatLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statBreak}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatBreak(LuaParser.StatBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statGoto}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatGoto(LuaParser.StatGotoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statDo}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatDo(LuaParser.StatDoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statWhile}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatWhile(LuaParser.StatWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statUntil}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatUntil(LuaParser.StatUntilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statIf}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatIf(LuaParser.StatIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statFor}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatFor(LuaParser.StatForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statForEach}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatForEach(LuaParser.StatForEachContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statFunctionDecl}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatFunctionDecl(LuaParser.StatFunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statFunctDeclLoc}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatFunctDeclLoc(LuaParser.StatFunctDeclLocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statVarAssignLoc}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatVarAssignLoc(LuaParser.StatVarAssignLocContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#retstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetstat(LuaParser.RetstatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(LuaParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(LuaParser.FuncnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(LuaParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#namelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamelist(LuaParser.NamelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(LuaParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expStrConcat}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpStrConcat(LuaParser.ExpStrConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expFuncDef}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpFuncDef(LuaParser.ExpFuncDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expMath}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMath(LuaParser.ExpMathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expLog}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpLog(LuaParser.ExpLogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expAtom}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAtom(LuaParser.ExpAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expUnary}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpUnary(LuaParser.ExpUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPrefxExp}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPrefxExp(LuaParser.ExpPrefxExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expTableConstr}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpTableConstr(LuaParser.ExpTableConstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expBin}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpBin(LuaParser.ExpBinContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(LuaParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#prefixexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixexp(LuaParser.PrefixexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(LuaParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#varOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarOrExp(LuaParser.VarOrExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#nameAndArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameAndArgs(LuaParser.NameAndArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#varSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSuffix(LuaParser.VarSuffixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argsExpList}
	 * labeled alternative in {@link LuaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsExpList(LuaParser.ArgsExpListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argsTableConstr}
	 * labeled alternative in {@link LuaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsTableConstr(LuaParser.ArgsTableConstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argsStr}
	 * labeled alternative in {@link LuaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsStr(LuaParser.ArgsStrContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#functiondef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondef(LuaParser.FunctiondefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#funcbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncbody(LuaParser.FuncbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#parlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParlist(LuaParser.ParlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#tableconstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableconstructor(LuaParser.TableconstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#fieldlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldlist(LuaParser.FieldlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldIndex}
	 * labeled alternative in {@link LuaParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldIndex(LuaParser.FieldIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldStr}
	 * labeled alternative in {@link LuaParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldStr(LuaParser.FieldStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldExp}
	 * labeled alternative in {@link LuaParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldExp(LuaParser.FieldExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#fieldsep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldsep(LuaParser.FieldsepContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#opExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExp(LuaParser.OpExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#opUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpUnary(LuaParser.OpUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#opMulDivMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpMulDivMod(LuaParser.OpMulDivModContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#opAddSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAddSub(LuaParser.OpAddSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#opStrConcat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpStrConcat(LuaParser.OpStrConcatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#opShift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpShift(LuaParser.OpShiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#opBinAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpBinAnd(LuaParser.OpBinAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#opBinXor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpBinXor(LuaParser.OpBinXorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#opBinOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpBinOr(LuaParser.OpBinOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#opComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpComp(LuaParser.OpCompContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#opLogAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpLogAnd(LuaParser.OpLogAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#opLogOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpLogOr(LuaParser.OpLogOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(LuaParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LuaParser.StringContext ctx);
}
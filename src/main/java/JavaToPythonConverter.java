import java.util.Arrays;
import java.util.stream.Collectors;

public class JavaToPythonConverter extends SimpleJavaBaseListener {

    private StringBuilder pythonCode = new StringBuilder();

    @Override
    public void enterClassDeclaration(SimpleJavaParser.ClassDeclarationContext ctx) {
        pythonCode.append("class ").append(ctx.Identifier().getText()).append(":\n");
    }

    @Override
    public void enterNormalMethodDeclaration(SimpleJavaParser.NormalMethodDeclarationContext ctx) {
        String[] identifier = ctx.Identifier().toString().substring(1, ctx.Identifier().toString().length() - 1).replace(",", "").split(" ");
        String methodName = identifier[0];
        String methodArgs = Arrays.stream(identifier).skip(1).collect(Collectors.joining(","));
//        String methodArgs = ctx.Identifier().toString().substring(1, ctx.Identifier().toString().length() - 1).replace(",", "").split(" ")[
        pythonCode.append("    def ").append(methodName).append("(self, ").append(methodArgs).append("):\n    ");
    }

    @Override
    public void enterMainMethodDeclaration(SimpleJavaParser.MainMethodDeclarationContext ctx) {
        pythonCode.append("    def main(args):\n").append("\n").append("    if __name__ == \"__main__\":\n").append("       main(sys.argv[1:])\n");
    }

    @Override
    public void enterPrintStatement(SimpleJavaParser.PrintStatementContext ctx) {
        if (ctx.StringLiteral() != null) {
            pythonCode.append("    print(\"").append(ctx.getTokens(SimpleJavaParser.StringLiteral).stream().map(token -> token.getText().substring(1, token.getText().length() - 1)).collect(Collectors.joining(" + "))).append("\")\n");
        }
        else if (ctx.Identifier() != null) {
            pythonCode.append("    print(").append(ctx.Identifier().getText()).append(")\n");
        }

    }

    @Override
    public void enterAssignmentStatement(SimpleJavaParser.AssignmentStatementContext ctx) {
        pythonCode.append("    ").append(ctx.getTokens(SimpleJavaParser.Identifier).get(0).getText()).append(" = ").append(ctx.getTokens(SimpleJavaParser.Identifier).get(1).getText()).append("\n");}
    public String getPythonCode() {
        return pythonCode.toString();
    }
}

package tw.pan93412.JavaTranslator.View;
import java.util.Scanner;

/**
 * 說明頁面
 */
public class HelpScreenActivity implements ActivityAbstruct {
    public static String activityContent() {
        final String space = "    "; // 4 格縮排 
        final String nlspace = "\n" + space; // newline + space

        return new StringBuilder()
            .append(I18n.i18n("Model.HelpScreenActivity.WelcomeTxt1"))
            .append(I18n.i18n("Model.HelpScreenActivity.WelcomeTxt2"))
            .append(space + I18n.i18n("model.HelpScreenActivity.UsageTxt"))
            .append(I18n.i18n("Model.HelpScreenActivity.CommandList"))
            .append("::next" + nlspace + I18n.i18n("Model.HelpScreenActivity.NextCommandDesc"))
            .append("::prev" + nlspace + I18n.i18n("Model.HelpScreenActivity.PrevCommandDesc"))
            .append("::to " + I18n.i18n("Model.HelpScreenActivity.ToCommandArg") + nlspace + I18n.i18n("Model.HelpScreenActivity.ToCommandDesc"))
            .append("::copy" + nlspace + I18n.i18n("Model.HelpScreenActivity.CopyCommandDesc"))
            .append("::save" + nlspace + I18n.i18n("Model.HelpScreenActivity.SaveCommandDesc"))
            .append("::saveas" + I18n.i18n("Model.HelpScreenActivity.FilenameArg") + nlspace + I18n.i18n("Model.HelpScreenActivity.SaveasCommandDesc"))
            .append("::load" + I18n.i18n("Model.HelpScreenActivity.FilenameArg") + nlspace + I18n.i18n("Model.HelpScreenActivity.LoadCommandDesc"))
            .append("::merge" + I18n.i18n("Model.HelpScreenActivity.MergeCommandArg") + nlspace + I18n.i18n("Model.HelpScreenActivity.MergeCommandDesc"))
            .append(nlspace + I18n.i18n("Model.HelpScreenActivity.MergeCommandComment"))
            .append("::exit" + nlspace + I18n.i18n("Model.HelpScreenActivity.ExitCommandDesc"))
            .append("::help" + nlspace + I18n.i18n("Model.HelpScreenActivity.HelpCommandDesc"))
            .append(I18n.i18n("Model.HelpScreenActivity.PromptMsg"))
            .toString();
    }

	public void doOutput() {
        System.out.print(activityContent());

        Scanner stdinReader = new Scanner(System.in);

        /*
         * `:n`
         * （會繼續輸出 ":"）
         * `:q`
         * （跳出迴圈，結束程式）
         */
        while (true) {
            System.out.print(":");
            if (stdinReader.hasNextLine()) {
                String input = stdinReader.nextLine();
                
                if (input == "q")
                    break;
            }
        }

        stdinReader.close();
	}
}
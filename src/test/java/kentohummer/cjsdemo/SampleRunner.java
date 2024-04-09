package kentohummer.cjsdemo;

import org.junit.platform.suite.api.*;

import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.core.options.Constants.PLUGIN_PROPERTY_NAME;

/**
 * ランナーのサンプルクラスです.
 */
@Suite
@SelectClasspathResources({
        // 実行したいfeatureファイルのパスを指定
        @SelectClasspathResource("sample.feature")
})
@ConfigurationParameters({
        // ステップ定義クラス群のパッケージを指定
        @ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "kentohummer.cjsdemo"),
        // レポートの出力形式や場所を指定
        @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
})
public class SampleRunner {
}

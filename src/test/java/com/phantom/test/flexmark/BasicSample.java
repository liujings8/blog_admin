package com.phantom.test.flexmark;

import com.vladsch.flexmark.ast.Node;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.options.MutableDataSet;

/**
 * <a>https://github.com/vsch/flexmark-java<a/>
 *
 * @Classname: BasicSample
 * @Description: TODO()
 * @Author: phantom
 * @Created: 2018/1/25 10:46
 */
public class BasicSample {
    public static void main(String[] args) {
        MutableDataSet options = new MutableDataSet();

        // uncomment to set optional extensions
        //options.set(Parser.EXTENSIONS, Arrays.asList(TablesExtension.create(), StrikethroughExtension.create()));

        // uncomment to convert soft-breaks to hard breaks
        // options.set(HtmlRenderer.SOFT_BREAK, "<br />\n");
        
        Parser parser = Parser.builder(options).build();
        HtmlRenderer renderer = HtmlRenderer.builder(options).build();

        // You can re-use parser and renderer instances
        Node document = parser.parse("This is *Sparta*");
        String html = renderer.render(document);// "<p>This is <em>Sparta</em></p>\n"
        System.out.println(html);
    }

}

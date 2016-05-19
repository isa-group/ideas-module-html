package es.us.isa.ideas.controller.html;

import es.us.isa.ideas.module.common.AppResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import es.us.isa.ideas.module.controller.BaseLanguageController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/language")
public class HtmlLanguageController extends BaseLanguageController {

    @RequestMapping(value = "/operation/{id}/execute", method = RequestMethod.POST)
    @ResponseBody
    @Override
    public AppResponse executeOperation(String id, String content, String fileUri, String auxArg0) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @RequestMapping(value = "/format/{format}/checkLanguage", method = RequestMethod.POST)
    @ResponseBody
    @Override
    public AppResponse checkLanguage(String id, String content, String fileUri) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @RequestMapping(value = "/convert", method = RequestMethod.POST)
    @ResponseBody
    @Override
    public AppResponse convertFormat(String currentFormat, String desiredFormat, String fileUri, String content) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

}

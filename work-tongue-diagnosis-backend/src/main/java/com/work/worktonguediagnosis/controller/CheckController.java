package com.work.worktonguediagnosis.controller;

import com.work.worktonguediagnosis.controller.response.BaseResponse;
import com.work.worktonguediagnosis.controller.response.TheResult;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Data;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * 上传舌头诊断数据请求
 */
@Data
class CheckSessionDiagnosisRequest implements Serializable {
    /**
     * 用户发送的消息
     */
    private String message;

    @Serial
    private static final long serialVersionUID = 1L;
}

/**
 * 上传问卷诊断数据请求
 */
@Data
class CheckQuestionnaireDiagnosisRequest implements Serializable {
    /**
     * 用户 ID
     */
    private Long userId;

    /**
     * 问卷 ID
     */
    private Long questionnaireId;

    /**
     * 答案列表
     */
    private List<Answer> answers;

    /**
     * 答案实体
     */
    @Data
    public static class Answer implements Serializable {

        /**
         * 问题 ID
         */
        private Long questionId;

        /**
         * 用户选择的选项
         */
        private String selectedOption;

        @Serial
        private static final long serialVersionUID = 1L;

    }
}

/**
 * 诊断控制器
 */
@RestController // 返回值默认为 json 类型
@RequestMapping("/check")
public class CheckController { // 通常控制层有服务层中的所有方法, 并且还有组合而成的方法, 如果组合的方法开始变得复杂就会封装到服务层内部

    @Operation(summary = "舌头诊断接口", description = "上传图片并返回诊断结果")
    @PostMapping("/tongue_diagnosis")
    public BaseResponse<String> checkTongueDiagnosis(
            @RequestParam("file") MultipartFile file,
            HttpServletRequest request) {
        // TODO: 简单校验

        // TODO: 调用服务
        String fileName = file.getOriginalFilename(); // 获取文件名
        long fileSize = file.getSize(); // 获取文件字节大小

        // TODO: 返回结果
        return TheResult.success(fileName + " " + fileSize);
    }

    @Operation(summary = "对话诊断接口", description = "上传对话并返回诊断结果")
    @PostMapping("/session_diagnosis")
    public BaseResponse<String> checkSessionDiagnosis(
            @RequestBody CheckSessionDiagnosisRequest checkSessionDiagnosisRequest,
            HttpServletRequest request
    ) {

        // TODO: 简单校验

        // TODO: 调用服务
        String message = checkSessionDiagnosisRequest.getMessage();
        String result = "是的您有病，还不轻";

        // TODO: 返回结果
        return TheResult.success(result);

    }

    @Operation(summary = "问卷诊断接口", description = "上传问卷并返回诊断结果")
    @PostMapping("/questionnaire_diagnosis")
    public BaseResponse<String> checkQuestionnaireDiagnosis(
            @RequestBody CheckQuestionnaireDiagnosisRequest checkQuestionnaireDiagnosisRequest,
            HttpServletRequest request
    ) {

        // TODO: 简单校验

        // TODO: 调用服务
        String result = "是的您有病，还不轻";

        // TODO: 返回结果
        return TheResult.success(result);

    }

}

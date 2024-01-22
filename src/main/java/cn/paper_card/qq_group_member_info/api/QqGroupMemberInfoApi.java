package cn.paper_card.qq_group_member_info.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("unused")
public interface QqGroupMemberInfoApi {
    @NotNull QqGroupMemberInfoService getQqGroupMemberInfoService();

    @Nullable String onMainGroupMessage(long senderQq, @NotNull String senderName, @NotNull String message) throws Exception;
}

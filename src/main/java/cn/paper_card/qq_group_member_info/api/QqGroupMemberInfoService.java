package cn.paper_card.qq_group_member_info.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("unused")
public interface QqGroupMemberInfoService {

    // 添加或者更新信息，添加返回true，更新返回false
    boolean addOrUpdateByQq(@NotNull QqGroupMemberInfo info) throws Exception;

    // 删除，删除成功true，不存在数据返回false
    boolean remove(long qq) throws Exception;

    // 根据QQ号码查询
    @Nullable QqGroupMemberInfo queryByQq(long qq) throws Exception;

    // 更新信息，是否在群
    boolean updateInGroup(long qq, boolean isGroup) throws Exception;

    // 更新信息，群名片
    boolean updateNameCard(long qq, @NotNull String nameCard) throws Exception;
}

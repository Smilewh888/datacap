<template>
  <div class="layout">
    <Layout>
      <RouterLink to="/chat/chatgpt">
        <Alert style="margin-bottom: 0px;" banner closable type="success">
          Support ChatGPT
        </Alert>
      </RouterLink>
      <LayoutHeader @changeLanguage="setLangCondition($event)"/>
      <layout-breadcrumb></layout-breadcrumb>
      <LayoutContent style="background-color: #FFFFFF; padding: 0; min-height: 560px"/>
      <LayoutFooter/>
      <LayoutAffix/>
    </Layout>
  </div>
</template>

<script lang="ts">
import LayoutContent from "@/views/layout/common/components/LayoutContent.vue";
import LayoutFooter from "@/views/layout/common/components/LayoutFooter.vue";
import LayoutHeader from "@/views/layout/common/components/LayoutHeader.vue";
import {useI18n} from 'vue-i18n';
import LayoutAffix from "@/views/layout/common/components/LayoutAffix.vue";
import LayoutBreadcrumb from "@/views/layout/common/components/LayoutBreadcrumb.vue";

export default {
  name: "LayoutContainer",
  components: {LayoutBreadcrumb, LayoutHeader, LayoutFooter, LayoutContent, LayoutAffix},
  setup()
  {
    const {locale} = useI18n();
    const setLangCondition = (v: string) => {
      locale.value = v;
    }
    return {
      setLangCondition
    }
  }
}
</script>

<style scoped>
.layout {
  background: #f5f7f9;
  position: relative;
  overflow: hidden;
}

.layout-topMiddleBottom .ivu-menu-light {
  background: none;
  color: #fff
}
</style>

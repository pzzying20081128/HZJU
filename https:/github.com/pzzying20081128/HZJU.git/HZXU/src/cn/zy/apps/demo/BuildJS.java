package cn.zy.apps.demo ;

import cn.zy.apps.demo.pojos.ProjectCarriedOutInfo ;
import cn.zy.apps.tools.dev.javascript.BuildJSModule ;
import cn.zy.apps.tools.dev.javascript.IBuildJSModule ;


public class BuildJS {
    public static void main(String[] args) throws Exception {
        

      String moduleNmae="project_carried_out_info";
      
      Class<?> clazz = ProjectCarriedOutInfo.class;
      
      String jsSrcPath  =  "/home/you/workspace/DevModule/src/cn/zy/apps/tools/dev/javascript/template";
      String out ="./release/build/"+moduleNmae;
      IBuildJSModule buildJSModule=new BuildJSModule(jsSrcPath ,out );
      buildJSModule.build(moduleNmae,clazz);

  

    }

}

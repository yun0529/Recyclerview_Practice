package com.example.recyclerviewpractice.src.custom

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewpractice.config.BaseActivity
import com.example.recyclerviewpractice.databinding.ActivityCustomRvBinding

data class Chapter (var id : Int, var chapterName: String, var imageUrl: String)
data class Subject (var id : Int, var subjectName: String, var chapters : ArrayList<Chapter>)

class CustomRvActivity : BaseActivity<ActivityCustomRvBinding>(ActivityCustomRvBinding::inflate) {
    var subjectSet = arrayListOf<Subject>()
    lateinit var sub_rv_adapter : RvSubjectAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        subjectSet = prepareData()
        sub_rv_adapter = RvSubjectAdapter(subjectSet, this)
        binding.rvCustom.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.rvCustom.adapter = sub_rv_adapter

    }

    private fun prepareData(): ArrayList<Subject> {
        val subjects = ArrayList<Subject>()
        val physics = Subject(1,"Physics",ArrayList())
        val chapter1 = Chapter(1,"Atomic powe","http://ashishkudale.com/images/phy/atoms.png")
        val chapter2 = Chapter(2,"Theory of relativity","http://ashishkudale.com/images/phy/sigma.png")
        val chapter3 = Chapter(3,"Magnetic field","http://ashishkudale.com/images/phy/magnet.png")
        val chapter4 = Chapter(4,"Practical 1","http://ashishkudale.com/images/phy/caliper.png")
        val chapter5 = Chapter(5,"Practical 2","http://ashishkudale.com/images/phy/micrometer.png")
        physics.chapters.add(chapter1)
        physics.chapters.add(chapter2)
        physics.chapters.add(chapter3)
        physics.chapters.add(chapter4)
        physics.chapters.add(chapter5)
        val chem = Subject(2,"Chemistry",ArrayList())
        chem.chapters.add(Chapter(6,"Chemical bonds","http://ashishkudale.com/images/chem/bonds.png"))
        chem.chapters.add(Chapter(7,"Sodium","http://ashishkudale.com/images/chem/sodium.png"))
        chem.chapters.add(Chapter(8,"Periodic table","http://ashishkudale.com/images/chem/periodic_table.png"))
        chem.chapters.add(Chapter(9,"Acid and Base","http://ashishkudale.com/images/chem/chem.png"))
        val bio = Subject(3,"Biology",ArrayList())
        bio.chapters.add(Chapter(10,"Bacteria","http://ashishkudale.com/images/bio/bacteria.png"))
        bio.chapters.add(Chapter(11,"DNA and RNA","http://ashishkudale.com/images/bio/dna.png"))
        bio.chapters.add(Chapter(12,"Study of microscope","http://ashishkudale.com/images/bio/microscope.png"))
        bio.chapters.add(Chapter(13,"Protein and fibers","http://ashishkudale.com/images/bio/protein.png"))
        val maths = Subject(4,"Maths",ArrayList())
        maths.chapters.add(Chapter(14,"Circle","http://ashishkudale.com/images/maths/circle.png"))
        maths.chapters.add(Chapter(15,"Geometry","http://ashishkudale.com/images/maths/geometry.png"))
        maths.chapters.add(Chapter(16,"Linear equations","http://ashishkudale.com/images/maths/linear.png"))
        maths.chapters.add(Chapter(17,"Graph","http://ashishkudale.com/images/maths/plot.png"))
        maths.chapters.add(Chapter(18,"Trigonometry","http://ashishkudale.com/images/maths/trigonometry.png"))
        subjects.add(physics)
        subjects.add(chem)
        subjects.add(maths)
        subjects.add(bio)
        return subjects
    }
}